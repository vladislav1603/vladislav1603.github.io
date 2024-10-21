import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

public class MTSOnlineRechargeTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testOnlineRechargeBlock() {
        // Check Block Name
        WebElement block = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]")));
        Assert.assertEquals(block.getText(), "Онлайн пополнение без комиссии");

        // Check Availability of Payment System Logos
        List<WebElement> logos = driver.findElements(By.cssSelector(".payment-logos img")); // Adjust the selector based on actual markup
        Assert.assertTrue(logos.size() > 0, "Payment system logos are not displayed");

        // Check "Подробнее о сервисе" link
        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        Assert.assertTrue(moreInfoLink.isDisplayed(), "More info link is not displayed");
        moreInfoLink.click();

        // Verify the link works (you may need to adjust this based on actual URL)
        wait.until(ExpectedConditions.urlContains("expected_url_part_after_click"));

        // Return to the main page after the link click (you may need to navigate back)
        driver.navigate().back();

        // Filling out the fields and clicking "Продолжить"
        WebElement phoneField = driver.findElement(By.id("phone")); // Adjust selector as necessary
        WebElement amountField = driver.findElement(By.id("amount")); // Adjust selector as necessary
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));

        phoneField.sendKeys("1234567890"); // Example phone number
        amountField.sendKeys("10"); // Example amount
        continueButton.click();

        // Verify next page or action
        wait.until(ExpectedConditions.urlContains("expected_next_page_url")); // Adjust based on expected outcome
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
