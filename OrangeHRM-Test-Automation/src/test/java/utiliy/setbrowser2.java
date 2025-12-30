package utiliy;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setbrowser2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void loginLogoutTest() {

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.className("oxd-button")).click();

        driver.findElement(By.linkText("My Info")).click();

        driver.findElement(By.className("oxd-userdropdown-tab")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
    @Test
    public void Ckdata() {
    	
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
