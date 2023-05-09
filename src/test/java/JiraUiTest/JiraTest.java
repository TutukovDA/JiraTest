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
        auth();//Авторизация на сайте + проверка авторизации
        mainPage();//Нажимаем на кнопку Проекты/Test (TEST) + проверка перехода на страницу Тесты
        countsTask(); // ловим число задач в процессе и выводим на экран счетчик, обрезав первые 5 знаков + в строке поиска ищем "TestSelenium_bug"+ проверка перехода на страницу результатом поиска
        checkStatusTask();// Проверяем статус задачи и выводим его на экран
        assertVersion();// Поверяем соответствие версии задачи Version 2.0
        createBug();//Создаем новый БАГ с рандомным номером
        changeStatusTask(); //Меняем статус созданного Бага СДЕЛАТЬ/В РАБОТЕ/ГОТОВО/
        System.out.println("Тест завершен");
    }
}