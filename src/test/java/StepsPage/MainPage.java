package StepsPage;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;
import static ElementsTest.BaseElements.BaseButton;
public class MainPage {
        public static void mainPage() {
        BaseButton("a","@aria-controls","browse_link-content").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        BaseButton("a","@id","admin_main_proj_link_lnk").shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        Assertions.assertEquals("Открытые задачи",BaseButton("span","@class","subnavigator-title").shouldBe(Condition.visible, Duration.ofSeconds(20)).getText());
    }
}
