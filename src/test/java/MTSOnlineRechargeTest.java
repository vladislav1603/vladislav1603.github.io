import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MTSOnlineRechargeTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private MTSOnlineRechargePage rechargePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/WebDiver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");

        // Close the cookie consent window if it appears
        try {
            driver.findElement(By.xpath("//button[contains(text(), 'Принять')]")).click();
        } catch (Exception e) {
            // Ignore if the button is not found
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        rechargePage = new MTSOnlineRechargePage(driver); // Initialize the page object
    }

    @Test
    public void testTitleContainsCorrectText() {
        String expectedTitle = "МТС – мобильный оператор в Беларуси";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Заголовок не соответствует ожидаемому!", expectedTitle, actualTitle);
    }

    @Test
    public void testSubmitPaymentDetails() {
        String phoneNumber = "297777777"; // Replace with a valid phone number
        String paymentAmount = "100.00"; // Replace with a valid amount

        rechargePage.submitPaymentDetails(phoneNumber, paymentAmount);
        rechargePage.waitForPayButtonToAppear(paymentAmount, wait);

        Assert.assertTrue("Результат отличается от ожидаемого!", rechargePage.isPayButtonDisplayed(paymentAmount));

        Assert.assertEquals("Выводимый номер не соответствует заданному!", phoneNumber, rechargePage.getDisplayedNumber());
        Assert.assertEquals("Выводимая сумма не соответствует заданной!", paymentAmount, rechargePage.getDisplayedAmount());
    }

    @Test
    public void testServiceSelectionLabels() {
        String[] services = {"Услуги связи", "Домашний интернет", "Рассрочка", "Задолженность"};

        for (String service : services) {
            rechargePage.selectService(service);
            Assert.assertTrue("Нету доступа к услуге: " + service, rechargePage.areLabelsPresent());
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
