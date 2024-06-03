package webops.automation.java.testing.helpers;
import objects.User;

public class Authentication extends AbstractRequest {

    public static void authenticate(String actor) {
        actor = actor.replaceAll(" ", "");
        User.setActiveUser(new User(actor, false));
        Webops.loginWebops();
    }
}