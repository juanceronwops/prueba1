package webops.automation.java.testing.components;
import webops.automation.java.testing.components.dynamic.FooterComponent;
import webops.automation.java.testing.components.dynamic.HeaderComponent;
import webops.automation.java.testing.helpers.BrowserHelper;

public class Components {

    private static final String footer = "//div[@id='footer']";
    private static final String header = "//div[@class='row']";

    public static HeaderComponent header() {
        return new HeaderComponent(BrowserHelper.getPage().locator(header));
    }

    public static FooterComponent footer() {
        return new FooterComponent(BrowserHelper.getPage().locator(footer));
    }

}