import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideSearchIssueTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy";

    @Test
    public void checkIssueIsFoundTest() {
        open("https://github.com");
        $(byName("q")).setValue(REPOSITORY).pressEnter();
        $(linkText(REPOSITORY)).click();
        $(partialLinkText("Issues")).click();
        $(withText(ISSUE_NAME)).shouldBe(visible);
    }
}

