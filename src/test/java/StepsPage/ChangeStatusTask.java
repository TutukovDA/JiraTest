package StepsPage;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static ElementsTest.BaseElements.*;
import static com.codeborne.selenide.Selenide.$x;

public class ChangeStatusTask {
    public static void changeStatusTask() {
        BaseButtonSearch("span", "contains(text(),'В работе')").click();
        BaseButtonSearch("span", "contains(text(),'Бизнес-процесс')").click();
        $x("//span[contains(text(),'Выполнено')]").shouldBe(Condition.visible,Duration.ofSeconds(20)).cl
       // $x("//span[@class='trigger-label'][contains(text(),'Выполнено')]/parent::a").click();
        //BaseSelect("span","@class","trigger-label'][contains(text(),'Выполнено')","parent::a").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        //////span[@class='trigger-label'][contains(text(),'Выполнено')]/parent::a
        // span[contains(text(),'Выполнено')]
        //*[@id="action_id_31"]/a/span}
    }
}
