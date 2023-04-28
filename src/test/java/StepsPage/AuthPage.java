package StepsPage;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static ElementsTest.BaseElements.*;

public class AuthPage {
    public static void auth(){
        BaseInput("@name","os_username").shouldBe(Condition.visible, Duration.ofSeconds(20)).sendKeys("ekuznecov");
        BaseInput("@name","os_password").shouldBe(Condition.visible, Duration.ofSeconds(20)).sendKeys("123Qwerty");
        BaseInput("@name","login").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        Assertions.assertEquals("Проекты",BaseButton("a","@title","Просмотр недавних проектов или списка всех проектов").getText());
    }
}
