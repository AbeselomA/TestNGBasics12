package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginExample {
    public static WebDriver driver;
    //to login into syntax HRMS application with following credentials
    //username: Admin
    //password: 12345
    @Test(priority = 1)
    public void binvalidCredentials(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        driver.findElement(By.id("btnLogin")).click();
       String text= driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);


    }
    // to login ingo syntax HRMS application with following credentials
    //username: NoAdmin
    //password: 123456
    @Test(priority = 2)
    public void ainvalidCredentials2(){
        driver.findElement(By.id("txtUsername")).sendKeys("NoAdmin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text= driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);

    }
    // precondition--> open the browser and navigate to the URL
    @BeforeMethod
    public void OpenBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
