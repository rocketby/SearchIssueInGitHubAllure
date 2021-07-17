import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaSearchIssueTest {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy";


    @Test
    public void checkIssueIsFoundTest() {
        step("Open main page", () -> {
            open("https://github.com");
        });

        step("Search of repository: " + REPOSITORY, () -> {
            $(byName("q")).setValue(REPOSITORY).pressEnter();
        });

        step("Open repository: " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });

        step("Open section: Issues", () -> {
            $(partialLinkText("Issues")).click();
        });

        step("Check, that issue with name: " + ISSUE_NAME + " is displayed", () -> {
            $(withText(ISSUE_NAME)).shouldBe(visible);
        });
    }
}
