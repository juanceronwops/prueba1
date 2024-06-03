package webops.automation.java.testing.cucumber.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import objects.User;

public class Hooks {

    @Before("@zzzz")
    public void InitiateApiTestRun() {
        System.setProperty("environment", "dev");
        System.setProperty("tenant", "test");
    }
    @After(order = 999)
    public void clearSession(Scenario scenario) {
        if (!scenario.getSourceTagNames().contains("@AfterIgnore")) {
         //  clear session method --- need to implement
        }
        User.setActiveUser(null);
    }
}