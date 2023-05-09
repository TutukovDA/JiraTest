package StepsPage;

import org.junit.jupiter.api.Assertions;
import static ElementsTest.BaseElements.BaseButton;
public class TestSeleniumPage {
    public static void checkStatusTask() {
        BaseButton("span","@id","status-val").hover().getText();
        System.out.println("Задача имеет статус: "+BaseButton("span","@id","status-val").hover().getText());
    }
    public static void assertVersion(){
        BaseButton("span","@id","versions-val").getText();
        System.out.println("Задача имеет версию: "+ BaseButton("span","@id","versions-val").getText());
        Assertions.assertEquals("Version 2.0",BaseButton("span","@id","versions-val").getText());
    }
}
