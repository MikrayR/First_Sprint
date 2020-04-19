package Pages;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInpage {

    static WebDriver driver;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passWord;


    @FindBy(xpath = "//button[@class='button is-dark']")
    public WebElement submitButton;


    public LogInpage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);



    }

}
