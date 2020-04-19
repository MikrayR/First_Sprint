package Pages;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KilimanjoroPage {

    static WebDriver driver;




    public void KilimanjoroPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
}
