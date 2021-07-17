import org.junit.jupiter.api.Test;

public class AnnotatedStepsSearchIssueTest {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy";

    private SearchSteps searchSteps = new SearchSteps();

    @Test
    public void checkIssueIsFoundTest() {
        searchSteps.openMainPage();
        searchSteps.searchRepository(REPOSITORY);
        searchSteps.openRepository(REPOSITORY);
        searchSteps.openIssues();
        searchSteps.checkIssueByNameIsVisible(ISSUE_NAME);
    }
}
