package Tests;

import Pages.LogInpage;
import Utils.ConfigReader;
import Utils.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {

    LogInpage logIn=new LogInpage();

    @BeforeMethod
    public void setLogin() throws InterruptedException {
        String username = ConfigReader.getProperties("username");
        String password = ConfigReader.getProperties("password");

        logIn.userName.sendKeys(username);
        logIn.passWord.sendKeys(password);
        logIn.submitButton.click();

        Thread.sleep(3000);
    }

    @BeforeClass
    public void setup(){
        String URL = ConfigReader.getProperties("url");
        Driver.getDriver().get(URL);

        //BrowserFactory.getDriver() includes below process
        // WebDriver driver;
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.get(URL);


    }

    @AfterClass
    public void teardwon() {

        //  Driver.getDriver().quit();


    }





}