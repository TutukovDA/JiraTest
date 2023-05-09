package StepsPage;

import org.junit.jupiter.api.Assertions;
import static ElementsTest.BaseElements.BaseButton;
public class TestSeleniumPage {
    public static void checkStatusTask() {
        BaseButton("span","@id","status-val").hover().getText();
        System.out.println("Задача имеет статус: "+BaseButton("span","@id","status-val").hover().getText());
    }
    public static void assertVersion(){
        BaseButton("a","@title","Version 2.0 ").getText();
        System.out.println("Задача имеет версию: "+ BaseButton("a","@title","Version 2.0 ").getText());
        Assertions.assertEquals("Version 2.0",BaseButton("a","@title","Version 2.0 ").getText());
    }
}
