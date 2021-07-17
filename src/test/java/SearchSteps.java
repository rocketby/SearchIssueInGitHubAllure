import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SearchSteps {

    @Step("Open main page")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Search of repository: [{repository}]")
    public void searchRepository(String repository) {
        $(byName("q")).setValue(repository).pressEnter();
    }

    @Step("Open repository: [{repository}]")
    public void openRepository(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Open section: Issues")
    public void openIssues() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Check, that issue with name: [{issueName}] is displayed")
    public void checkIssueByNameIsVisible(String issueName){
        $(withText(issueName)).shouldBe(visible);
    }
}
