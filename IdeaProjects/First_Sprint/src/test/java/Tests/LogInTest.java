package Tests;

import Pages.LogInpage;
import Utils.ConfigReader;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    LogInpage logIn=new LogInpage();

    @Test
    public void setLogin(){
        String username= ConfigReader.getProperties("username");
        String password=ConfigReader.getProperties("password");

        logIn.userName.sendKeys(username);
        logIn.passWord.sendKeys(password);
        logIn.submitButton.click();
    }
}
