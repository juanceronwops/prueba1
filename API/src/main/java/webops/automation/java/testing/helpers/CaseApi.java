package webops.automation.java.testing.helpers;

import io.restassured.response.Response;
import webops.automation.java.testing.objects.bodies.PostNewCase;

public class CaseApi extends AbstractRequest {
    private static final String BASEPATH = "/2.0/";

    public static Response createNewCase(PostNewCase newCase) {
        return getAuthenticatedRequestSpecs()
                .basePath(BASEPATH+"case")
                .body(newCase)
                .post();
    }
}