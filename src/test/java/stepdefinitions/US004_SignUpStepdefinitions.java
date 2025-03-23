package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;



public class US004_SignUpStepdefinitions {
    HomePage homePage;



    @Given("User goes to home page")
    public void user_goes_to_home_page() throws InterruptedException {

       Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
       Thread.sleep(1000);

    }

    @Then("click sign-up button")
    public void click_sign_up_button () throws InterruptedException {

        homePage = new HomePage();
        HomePage.signUpButton.click();
        Thread.sleep(1000);

    }

    @When("enter name")
    public void enter_name() throws InterruptedException {

        homePage.name.sendKeys("Levent");
        Thread.sleep(1000);
    }

    @When("enter email or phone number")
    public void enter_email_or_phone_number() throws InterruptedException {

        homePage.emailOrPhoneNumber.sendKeys("leventb68@gmail.com");
        Thread.sleep(1000);

    }

    @When("enter password")
    public void enter_password () throws InterruptedException {

        homePage.password.sendKeys("levent6817");
        Thread.sleep(1000);

    }

    @Then("click create account")
    public void click_create_account() {

        homePage.createAccount.click();

    }

        @Then("the user must be on the dashboard")
        public void the_user_must_be_on_the_dashboard () {

        }



    }

