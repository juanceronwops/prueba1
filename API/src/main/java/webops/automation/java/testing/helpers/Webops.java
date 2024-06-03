package webops.automation.java.testing.helpers;
import io.restassured.response.Response;


public class Webops extends AbstractRequest {
    public static String accessToken;

    public static void loginWebops() {
        Response response;
        response = initiateWebopsAuthentication();
        accessToken = response.getHeader("Access_token");
    }

    private static Response initiateWebopsAuthentication() {
        return getBasicWebOpsRequestSpecs()
                .basePath("/1.0/token")
                .post();
    }
}