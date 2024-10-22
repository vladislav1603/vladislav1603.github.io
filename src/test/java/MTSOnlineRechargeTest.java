import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MTSOnlineRechargeTest {

    private  WebDriver driver;

    @Before
    public  void  setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/WebDiver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void TestOpenPage() {

        String expectedTitle = "МТС – мобильный оператор в Беларуси";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);

        WebElement paymentBlock = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        Assert.assertNotNull("Блок 'Онлайн пополнение' не найден!", paymentBlock);
        List<WebElement> paySystemLogos = driver.findElements(By.cssSelector("img[alt='MasterCard Secure Code']"));
        Assert.assertFalse("Не найдены логотипы платёжных систем!", paySystemLogos.isEmpty());

        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе")); // Adjust text as needed
        String originalUrl = driver.getCurrentUrl();
        link.click();
        String newUrl = driver.getCurrentUrl();
        Assert.assertNotEquals("Ссылка не переносит нас на другую страницу!", originalUrl, newUrl);

        WebElement phoneNumberField = driver.findElement(By.xpath("(//input[@id='connection-phone'])[1]"));
        WebElement paymentAmountField = driver.findElement(By.xpath("(//input[@id='connection-sum'])[1]"));
        WebElement continueButton = driver.findElement(By.xpath("(//button[@type='submit'][contains(text(),'Продолжить')])[1]"));

        String phoneNumber = "297777777";
        String paymentAmount = "100";

        phoneNumberField.sendKeys(phoneNumber);
        paymentAmountField.sendKeys(paymentAmount);

        continueButton.click();

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
