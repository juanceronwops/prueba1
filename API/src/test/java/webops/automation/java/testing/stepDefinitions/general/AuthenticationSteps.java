package webops.automation.java.testing.stepDefinitions.general;
import webops.automation.java.testing.helpers.Authentication;
import io.cucumber.java.en.Given;

public class AuthenticationSteps {

    @Given("^the user is authenticated as a (.*)$")
    public void webOpsAuthentication(String actor) {
        Authentication.authenticate(actor);
    }

}