package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SignUpPage {
    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = ":r0:")
    public WebElement name;

    @FindBy(id = ":r1:")
    public WebElement email;

    @FindBy(id = ":r2:")
    public WebElement password;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement signUpButton;

    @FindBy(xpath = "//button[.='Sign up with Google']")
    public WebElement signUpGoogleButton;

    @FindBy(xpath = "//a[.='Log in']")
    public WebElement loginButton;


}



