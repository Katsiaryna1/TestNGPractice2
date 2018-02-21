import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class KateTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void verify() throws InterruptedException{
        String parenthandle;
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        parenthandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@ui-sref='page.recover']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dsds12@mailinator.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        ((JavascriptExecutor)driver).executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList <String>(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1));
        driver.get ("https://www.mailinator.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='inboxfield']")).sendKeys("dsds12");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='all_message-min_text all_message-min_text-3']")).click();;
        Thread.sleep(5000);
        int size = driver.findElements(By.name("msg_body")).size();
        System.out.println(size);

        driver.switchTo().frame(1);
        driver.findElement(By.partialLinkText("http://fits.qauber.com/#/page/change-password")).click();
        Thread.sleep(3000);
        //driver.switchTo().window(tabs.get(0));
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(0)).close();
        driver.switchTo().window(tabs.get(1)).close();
    }
    @AfterTest
    public void tearDown() throws InterruptedException {
        System.out.println("After all tests script");
        Thread.sleep(3000);

    }
}
