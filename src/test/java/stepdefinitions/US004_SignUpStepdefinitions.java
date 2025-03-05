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
    public void user_goes_to_home_page() {

       Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }

    @Then("click sign-up button")
    public void click_sign_up_button () {

        homePage = new HomePage();
        HomePage.SignUpButton.click();

    }

    @When("enter email")
    public void enter_email() {



    }


    @When("enter name and surname")
    public void enter_name_and_surname () {

    }

    @When("enter password")
    public void enter_password () {
    }

    @When("enter confirm password")
    public void enter_confirm_password () {

    }

    @Then("click confirm button")
    public void click_confirm_button() {

    }

        @Then("the user must be on the dashboard")
        public void the_user_must_be_on_the_dashboard () {

        }



    }

