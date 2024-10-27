import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MTSOnlineRechargePage {
    private WebDriver driver;

    // Locators
    private By phoneInput = By.id("connection-phone");
    private By sumInput = By.id("connection-sum");
    private By submitButton = By.xpath("//button[@type='submit' and ancestor::div[contains(@class, 'your-block-class')]]");
    private By serviceSelect = By.className("select__list"); // Replace with the actual ID of the select field
    private By numberLabel = By.xpath("//label[contains(text(), 'Номер')]");
    private By sumaaLabel = By.xpath("//label[contains(text(), 'Сумма')]");
    private By emailLabel = By.xpath("//label[contains(text(), 'E-mail')]");

    // Pop-up block locators
    private By displayedNumber = By.xpath("//div[contains(@class, 'your-popup-class')]//span[contains(text(), 'Number')]/following-sibling::span");
    private By displayedAmount = By.xpath("//div[contains(@class, 'your-popup-class')]//span[contains(text(), 'Sumaa')]/following-sibling::span");

    public MTSOnlineRechargePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPhoneNumber(String phoneNumber) {
        WebElement phoneField = driver.findElement(phoneInput);
        phoneField.sendKeys(phoneNumber);
    }

    public void enterPaymentAmount(String amount) {
        WebElement sumField = driver.findElement(sumInput);
        sumField.sendKeys(amount);
    }

    public void clickSubmit() {
        WebElement submitBtn = driver.findElement(submitButton);
        submitBtn.click();
    }

    public boolean isPayButtonDisplayed(String amount) {
        String buttonText = " Оплатить  100.00 BYN ";
        try {
            WebElement payBtn = driver.findElement(By.xpath("//button[contains(text(), '" + buttonText + "')]"));
            return payBtn.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void submitPaymentDetails(String phoneNumber, String amount) {
        enterPhoneNumber(phoneNumber);
        enterPaymentAmount(amount);
        clickSubmit();
    }

    public void waitForPayButtonToAppear(String amount, WebDriverWait wait) {
        String buttonText = " Оплатить  100.00 BYN ";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), '" + buttonText + "')]")));
    }

    public void selectService(String service) {
        Select dropdown = new Select(driver.findElement(serviceSelect));
        dropdown.selectByVisibleText(service);
    }

    public boolean areLabelsPresent() {
        boolean numberPresent = driver.findElements(numberLabel).size() > 0;
        boolean sumaaPresent = driver.findElements(sumaaLabel).size() > 0;
        boolean emailPresent = driver.findElements(emailLabel).size() > 0;
        return numberPresent && sumaaPresent && emailPresent;
    }

    // New methods to get values from the pop-up
    public String getDisplayedNumber() {
        return driver.findElement(displayedNumber).getText();
    }

    public String getDisplayedAmount() {
        return driver.findElement(displayedAmount).getText();
    }
}
