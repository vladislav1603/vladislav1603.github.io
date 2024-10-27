import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MTSOnlineRechargeTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/WebDiver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");

        // Close the cookie consent window if it appears
        try {
            WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[contains(text(), 'Принять')]"));
            acceptCookiesButton.click();
        } catch (Exception e) {
            // If the button is not found, we ignore it and continue
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait up to 10 seconds
    }

    @Test
    public void testTitleContainsCorrectText() {
        String expectedTitle = "МТС – мобильный оператор в Беларуси";
        String actualTitle = driver.getTitle();
        assertEquals("Заголовок сайта не соответствует ожиданиям!", expectedTitle, actualTitle);
    }

    @Test
    public void testPaymentBlockContainsRequiredTexts() {
        // Check that the "Онлайн пополнение" block is present
        WebElement paymentBlock = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        assertNotNull("Блок 'Онлайн пополнение' не найден!", paymentBlock);

        String blockText = paymentBlock.getText();
        assertTrue("Текст 'без комиссии' не найден в блоке 'Онлайн пополнение'!", blockText.contains("без комиссии"));
    }

    @Test
    public void testPaymentSystemLogosAreCorrect() {
        List<String> expectedLogos = List.of("MasterCard Secure Code", "Visa", "MasterCard", "Verified By Visa", "Белкарт");
        List<WebElement> logos = driver.findElements(By.cssSelector("img"));

        for (String expectedLogo : expectedLogos) {
            boolean found = logos.stream().anyMatch(logo -> Objects.equals(logo.getAttribute("alt"), expectedLogo));
            Assert.assertTrue("Логотип '" + expectedLogo + "' не найден!", found);
        }

        List<String> unexpectedLogos = List.of("UnexpectedLogo1", "UnexpectedLogo2");
        for (String unexpectedLogo : unexpectedLogos) {
            boolean found = logos.stream().anyMatch(logo -> Objects.equals(logo.getAttribute("alt"), unexpectedLogo));
            Assert.assertFalse("Неожиданный логотип '" + unexpectedLogo + "' отображается!", found);
        }
    }

    @Test
    public void testLinkNavigatesToAnotherPage() {
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        String originalUrl = driver.getCurrentUrl();
        link.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Порядок оплаты и безопасность интернет платежей')]")));

        String newUrl = driver.getCurrentUrl();
        assertNotEquals("Ссылка не переносит нас на другую страницу!", originalUrl, newUrl);
    }

    @Test
    public void testSubmitPaymentDetails() {
        // Locate the input fields
        WebElement phoneInput = driver.findElement(By.id("connection-phone"));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));

        // Enter the phone number and payment amount
        String phoneNumber = "297777777"; // Replace with a valid phone number for your test
        String paymentAmount = "100"; // Replace with a valid amount for your test
        phoneInput.sendKeys(phoneNumber);
        sumInput.sendKeys(paymentAmount);

        // Locate and click the submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit' and ancestor::div[contains(@class, 'pay__wrapper')]]"));
        submitButton.click();

        String buttonText = " Оплатить  120.00 BYN ";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), '" + buttonText + "')]")));

        // Assert that the button is displayed
        WebElement payButton = driver.findElement(By.xpath("//button[contains(text(), '" + buttonText + "')]"));
        assertTrue("The payment button did not appear!", payButton.isDisplayed());
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
