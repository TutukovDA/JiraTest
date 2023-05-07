package StepsPage;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.time.Duration;
import static ElementsTest.BaseElements.*;
import static com.codeborne.selenide.Selenide.$;
public class TestCreateBag {
    public static void createBug() {
   BaseButton("a","@accesskey","C").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();//a[@accesskey='C']
        BaseInput("*","@class","text long-field").sendKeys("Баг"); ////input[@class='text long-field']
        BaseSelect("*","@id","fixVersions","optgroup/option[2]")
                .shouldBe(Condition.visible, Duration.ofSeconds(20))
                .click();////*[@id="fixVersions"]/optgroup/option[2]
        BaseSelect("*","@id","versions","optgroup/option[2]")
                .shouldBe(Condition.visible, Duration.ofSeconds(20))
                .click();//*[@id="versions"]/optgroup/option[2]
        BaseButton("*","@id","create-issue-submit")////*[@id="create-issue-submit"]
                .shouldBe(Condition.visible, Duration.ofSeconds(20))
                .click();//a[@accesskey='S']
        //$(By.xpath("//textarea[@name='description']")).val("Описание БАГА");
        //BaseInput("textarea","@name","description").setValue("jvgfdkv");//textarea[@id='description']
        //BaseInput("textarea","@id","environment").clear().sendKeys(""); ///*[@id="description"] //*[@id='description-wiki-edit']
       //Assertions.assertEquals("aui-list-item aui-list-item-li-ошибка active",BaseButton("li","@class","aui-list-item aui-list-item-li-ошибка active").getText());  //li[@class="aui-list-item aui-list-item-li-ошибка active"]
        // System.out.println("Найдена Ошибка");
    }

}
