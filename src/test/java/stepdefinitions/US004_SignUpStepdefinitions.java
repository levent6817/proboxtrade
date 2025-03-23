package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.SignUpPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;


public class US004_SignUpStepdefinitions {
    HomePage homePage;
    SignUpPage signUpPage;
    WebDriverWait wait;
    WebDriver driver;

    @Given("User goes to home page")
    public void user_goes_to_home_page()  {

       Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));


    }

    @Then("click sign-up button")
    public void click_sign_up_button ()  {
        homePage = new HomePage();
        homePage.signUpButton.click();

    }

    @When("enter name and surname")
    public void enter_name_and_surname () throws InterruptedException {
        signUpPage = new SignUpPage();
        Thread.sleep(1000);
        signUpPage.name.sendKeys("Jhon Doe");
    }
    @When("enter email")
    public void enter_email() {
signUpPage = new SignUpPage();
signUpPage.email.sendKeys("jhon.doe@example.com");


    }

    @When("enter password")
    public void enter_password () {
        signUpPage = new SignUpPage();
        signUpPage.password.sendKeys("jD123456");
    }



    @Then("click create account")
    public void clickCreateAccount() {
        signUpPage = new SignUpPage();
        signUpPage.signUpButton.click();

    }

        @Then("the user must be on the dashboard")
        public void the_user_must_be_on_the_dashboard () {

        }


}

