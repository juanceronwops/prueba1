package webops.automation.java.testing.stepDefinitions.general;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import webops.automation.java.testing.helpers.CaseApi;
import webops.automation.java.testing.objects.bodies.PostNewCase;
import org.junit.Assert;

public class CaseSteps {
    @Then("the user can create a new case")
    public void theUserCanCreateANewCase() {
        Response response = CaseApi.createNewCase(new PostNewCase());
        Assert.assertEquals(response.getBody().asString(), 200, response.getStatusCode());
    }
}