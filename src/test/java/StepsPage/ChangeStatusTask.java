package StepsPage;

import com.codeborne.selenide.Condition;
import org.junit.Assert;

import java.time.Duration;
import static ElementsTest.BaseElements.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ChangeStatusTask {

    public static void changeStatusTask() {
        BaseInput("input","@name","searchString").setValue(NAME_BUG).pressEnter();
        BaseButton("a","@id","action_id_11").shouldBe(Condition.visible,Duration.ofSeconds(20)).click();
        Assert.assertEquals("СДЕЛАТЬ", BaseSelect("*","@id","status-val","/span").getText());
        BaseButton("a","@id","action_id_21").shouldBe(Condition.visible,Duration.ofSeconds(20)).click();
        sleep(2_000);
        Assert.assertEquals("В РАБОТЕ", BaseSelect("*","@id","status-val","/span").getText());
        BaseButton("a","@id","opsbar-transitions_more").shouldBe(Condition.visible,Duration.ofSeconds(20)).click();
        BaseButtonSearch("span","contains(text(),'Выполнено')").shouldBe(Condition.visible,(Duration.ofSeconds(20))).click();
        sleep(2_000);
        Assert.assertEquals("ГОТОВО", BaseSelect("*","@id","status-val","/span").getText());
        }
}
