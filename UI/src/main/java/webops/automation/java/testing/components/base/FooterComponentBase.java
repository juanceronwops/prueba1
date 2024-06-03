package webops.automation.java.testing.components.base;

import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class FooterComponentBase {
    protected static Locator component;
    protected final static String divReleaseVersion = "//div[text()='24.03.0.54']";
    protected final static String urlToPro = "//a[@href='http://www.webops.com/']";

    protected void isDisplayed() {
        assertThat(component).isVisible();
        assertThat(component.locator(divReleaseVersion)).isVisible();
        assertThat(component.locator(urlToPro)).isVisible();
    }
}