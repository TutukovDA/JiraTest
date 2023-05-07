package StepsPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.PressEnter;
import com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.time.Duration;

import static ElementsTest.BaseElements.*;
import static com.codeborne.selenide.Selenide.$;

public class TestPage {
    public static void countsTask() {
        String countsTask = BaseGetText("span"," из").getText().substring(5);
        System.out.println("Общее количество заведенных задач в проекте: "+countsTask);
        $(By.name("searchString")).val("TestSelenium").pressEnter();
        Assertions.assertEquals("Искать",BaseButton("h1","@title","Искать").
                shouldBe(Condition.visible, Duration.ofSeconds(20)).
                getText());
    }
}