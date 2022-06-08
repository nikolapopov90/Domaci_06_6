import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    private By usernameInputBox = By.id("txt-username");
    private By passwordInputBox = By.id("txt-password");
    private By loginButton = By.id("btn-login");

    private By getLoginName = By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div[1]/div[1]/div/div/input");

    private By getPassword = By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div[1]/div[2]/div/div/input");

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void inputUsername(){
        getDriver().findElement(usernameInputBox).sendKeys(getDriver().findElement(getLoginName).getAttribute("value"));
    }

    public void inputPassword(){
        getDriver().findElement(passwordInputBox).sendKeys(getDriver().findElement(getPassword).getAttribute("value"));
    }

    public void loginClick(){
        getDriver().findElement(loginButton).click();
    }

    public void userLogin(){
        inputUsername();
        inputPassword();
        loginClick();
    }
}
