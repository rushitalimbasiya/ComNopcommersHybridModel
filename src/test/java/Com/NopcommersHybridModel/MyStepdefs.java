package Com.NopcommersHybridModel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("^I am on Home Page$")
    public void iAmOnHomePage()
    {

    }

    @When("^I click on Register link$")
    public void iClickOnRegisterLink()
    {
        homePage.clickOnRegisterLink();
    }

    @And("^I select male$")
    public void iSelectMale()
    {
        registerPage.maleButtMethod();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() {
        registerPage.inputFirstNameMethod();

    }

    @And("^I enter Last name$")
    public void iEnterLastName() {
        registerPage.inputLastNameMethod();

    }

    @And("^I Select day$")
    public void iSelectDay() {
        registerPage.selectDateMethod();

    }

    @And("^I select Month$")
    public void iSelectMonth() {
        registerPage.selectMonthMethod();

    }

    @And("^I select Year$")
    public void iSelectYear() {
        registerPage.selectYearMethod();

    }

    @And("^I enter Email$")
    public void iEnterEmail() {
        registerPage.inputEmailMethod();

    }

    @And("^I enter Company name$")
    public void iEnterCompanyName() {
        registerPage.inputCompanyNameMethod();

    }

    @And("^I enter Password$")
    public void iEnterPassword() {
        registerPage.inputPasswordMethod();


    }

    @And("^I enter Confirm password$")
    public void iEnterConfirmPassword() {
        registerPage.inputConfirmPasswordMethod();


    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        registerPage.clickOnRegisterButton();

    }

    @Then("^I should see massage Your registration completed$")
    public void iShouldSeeMassageYourRegistrationCompleted() {
    }
}
