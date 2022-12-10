package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {



   public HomePage(WebDriver driver) {
        super(driver);
    }
   // Elements
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement lnkMyaccount;



   @FindBy(xpath = "//div[@class='navbar-right hidden-xs']//a[2]")
    WebElement lnkRegister;

   @FindBy(xpath="//div[@class='navbar-right hidden-xs']/a[1]")
  	WebElement Login;

   
   // Action Methods
    public void clickMyAccount() {
        lnkMyaccount.click();
    }



   public void clickRegister() {
        lnkRegister.click();
    }
    public void clickLogin() {
    	Login.click();
    }
   
}
