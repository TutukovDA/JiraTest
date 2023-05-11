package JiraUiTest;

import WebHooks.WebHooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static StepsPage.AuthPage.auth;
import static StepsPage.ChangeStatusTask.changeStatusTask;
import static StepsPage.MainPage.mainPage;
import static StepsPage.TestCreateBag.createBug;
import static StepsPage.TestPage.countsTask;
import static StepsPage.TestSeleniumPage.assertVersion;
import static StepsPage.TestSeleniumPage.checkStatusTask;
import static com.codeborne.selenide.Selenide.*;
public class JiraTest extends WebHooks {
    @Test
    @DisplayName("Задание по Jira по 4 лекции")
    public void JTest() {
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        auth();
        mainPage();
        countsTask();
        checkStatusTask();
        assertVersion();
        createBug();
        changeStatusTask();
        System.out.println("Тест завершен");
    }
}