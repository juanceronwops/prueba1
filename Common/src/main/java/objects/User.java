package objects;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import lombok.Getter;
import lombok.Setter;
import java.util.Base64;

public class User {

    private String password;
    @Getter
    private String accountname;
    @Getter
    @Setter
    private String actor;
    @Getter
    private String provider;
    @Getter
    @Setter
    private static User activeUser;

    public User(String actor) {
        User user = new User(actor, false);
        this.password = user.password;
        this.accountname = user.accountname;
        this.actor = user.actor;
        this.provider = user.provider;
    }

    public User(String actor, boolean isActive) {
        String[] propertyValues = PropertiesFile.Users.readProperties(
                System.getProperty("tenant") + "." + actor + "." + System.getProperty("environment"));
        this.accountname = propertyValues[0];
        this.password = propertyValues[1];

        if (actor.contains("test4")) {
            this.provider = "xxxx";
            this.actor = actor.replace("xxxx", "");
        } else if (actor.contains("test3")) {
            this.provider = "qaswa";
            this.actor = actor.replace("zz", "");
        } else if (actor.contains("zz")) {
            this.provider = "zz";
            this.actor = actor.replace("xx", "");
        } else {
            this.provider = "test8";
            this.actor = actor;
        }
    }

    public String getPassword() {
        return new String(Base64.getDecoder().decode(password));
    }

}