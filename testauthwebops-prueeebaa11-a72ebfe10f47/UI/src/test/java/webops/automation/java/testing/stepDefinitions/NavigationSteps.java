package webops.automation.java.testing.stepDefinitions;
import io.cucumber.java.en.Then;
import webops.automation.java.testing.components.Components;

public class NavigationSteps extends AbstractPages {

    @Then("the user should be redirected to the home page")
    public void theUserShouldBeRedirectedToTheHomePage() {
        Components.header().isDisplayed();
        Components.footer().isDisplayed();
    }
}