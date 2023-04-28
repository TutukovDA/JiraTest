package StepsPage;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.time.Duration;

import static ElementsTest.BaseElements.BaseButton;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
        public static void button() {
        BaseButton("a","@aria-controls","browse_link-content").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        BaseButton("a","@id","admin_main_proj_link_lnk").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        Assertions.assertEquals("Открытые задачи",BaseButton("span","@class","subnavigator-title").shouldBe(Condition.visible, Duration.ofSeconds(20)).getText());
////span[@class='subnavigator-title']

    }
}
