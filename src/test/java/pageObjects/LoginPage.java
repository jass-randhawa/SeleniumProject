package pageObjects;


import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {



   public LoginPage(WebDriver driver) {
        super(driver);
    }



   @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmailAddress;



   @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;

  

   @FindBy(xpath = "//button[@type='submit']")
    List<WebElement> btnLogin;
   
   @FindBy(xpath = "//input[@name='pin']")
   WebElement pin;
   
   @FindBy(xpath="//button[@type='submit']")
   WebElement cont;

    public void setEmail(String email) {
        txtEmailAddress.sendKeys(email);
    }

   public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

   public void clickLogin() {
        btnLogin.get(0).click();
        

}
   public void enterpin() {
	   pin.clear();
	   pin.sendKeys("0121");
   }
   public void cont() {
	   cont.click();
   }
}
