package JiraUiTest;

import WebHooks.WebHooks;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static StepsPage.AuthPage.auth;
import static StepsPage.MainPage.button;
import static StepsPage.TestPage.countsTask;
import static StepsPage.TestSeleniumPage.assertVersion;
import static StepsPage.TestSeleniumPage.checkStatusTask;
import static com.codeborne.selenide.Selenide.*;
public class JiraTest extends WebHooks {
    @Test
    @DisplayName("Задание по Jira по 4 лекции")
    public void JTest(){
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        auth();//Авторизация на сайте https://edujira.ifellow.ru/secure/Dashboard.jspa + проверяем факт авторизации
        button();//Нажимаем на кнопку Проекты/Test (TEST) + проверяем факт перехода на страницу Тесты
        countsTask(); // ловим число задач в процессе и выводим на экран счетчик
                    // + в строке поиска ищем "TestSelenium"
                    // + проверям переход на страницу результатом поиска
        checkStatusTask();// Проверяем статус задачи и выводим его на экран
        assertVersion();// Поверяем соответствие версии задачи Version 2.0 (кстати здесь есть "вопросики по " " в значении @title
        System.out.println("Тест завершен");
    }
}
