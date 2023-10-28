package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.authentication.Login;
import starter.altashop.authentication.Register;


public class AuthSteps {

    @Steps
    Login login;
    @Steps
    Register register;


    @Given("I have valid credentials")
    public void iHaveValidCredentials() {
        login.iHaveValidCredentials();
    }

    @When("I submit a POST request to {string} with email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndPassword(String ignoredArg0, String ignoredArg1, String ignoredArg2) {
        login.iSubmitAPOSTRequestToWithEmailAndPassword();
    }

    @Then("I receive valid HTTP response code Login {int}")
    public void iReceiveValidHTTPResponseCodeLogin(int ignoredArg0) {
        login.iShouldGetAResponseCode();
    }

    @Given("I register using the correct data")
    public void iRegisterUsingTheCorrectData() {
        register.RegisterUsingTheCorrectData();
    }

    @When("I submit a POST request to {string} with fullname {string}, email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithFullnameEmailAndPassword(String ignoredArg0, String ignoredArg1, String ignoredArg2, String ignoredArg3) {
        register.POSTRequestToWithFullnameEmailAndPassword();
    }

    @Then("I receive valid HTTP response code register {int}")
    public void iReceiveValidHTTPResponseCodeRegister(int ignoredArg0) {
        register.ValidHTTPResponseCodeRegister();
    }

    @And("register successfully")
    public void registerSuccessfully() {
        register.registerSuccessfully();
    }
}
