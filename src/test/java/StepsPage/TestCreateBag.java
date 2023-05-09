package StepsPage;
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.time.Duration;
import static ElementsTest.BaseElements.*;
import static com.codeborne.selenide.Selenide.$x;

public class TestCreateBag {
       public static void createBug() {
   BaseButton("a","@accesskey","C").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        BaseSelect("div","@id","issuetype-single-select","input").setValue("Ошибка").pressEnter();
        BaseInput("*","@class","text long-field").sendKeys(NAME_BUG);
        BaseInput("*","@id","description").sendKeys("Подробное описание ОШИБКИ");
        BaseSelect("*","@id","fixVersions","optgroup/option[2]")
                .shouldBe(Condition.visible, Duration.ofSeconds(20))
                .click();
        BaseSelect("*","@id","versions","optgroup/option[2]")
                .shouldBe(Condition.visible, Duration.ofSeconds(20))
                .click();
        BaseButton("*","@id","create-issue-submit").shouldBe(Condition.visible, Duration.ofSeconds(20))
                .click();
        BaseInput("input","@name","searchString").setValue(NAME_BUG).pressEnter();
        Assert.assertEquals(NAME_BUG,BaseGetText("*[@id='summary-val']",NAME_BUG).shouldBe(Condition.visible,Duration.ofSeconds(20)).getText());
        Assert.assertTrue(BaseButton("img","@title","Ошибка").shouldBe(Condition.visible,Duration.ofSeconds(20)).exists());
        Assert.assertEquals("Version 2.0",BaseButton("span","@title","Version 2.0 ").shouldBe(Condition.visible,Duration.ofSeconds(20)).getText());
        Assert.assertNotNull(BaseInput("*","@id","description"));
    }
}