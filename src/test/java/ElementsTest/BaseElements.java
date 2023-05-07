package ElementsTest;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BaseElements {

    public static SelenideElement BaseInput(String tag,String atribute, String value) {
        return $x("//"+tag+"[" + atribute + "='" + value + "']");
    }

    //a[@aria-controls='browse_link-content']
    public static SelenideElement BaseButton(String tag, String atribute, String value) {
        return $x("//" + tag + "[" + atribute + "='" + value + "']");
    }
    public static SelenideElement BaseButtonSearch(String tag,String contains){
        return $x("//"+tag+"["+contains+"]");
    }////span[contains(text(),'В работе')]

    public static SelenideElement BaseGetText(String atribute, String value) {
        return $x("//" + atribute + "[contains(text(),'" + value + "')]");
    }
    public static SelenideElement BaseSelect(String tag, String atribute, String value, String options) {
        return $x("//" + tag + "[" + atribute + "='" + value + "']/"+options);////*[@id="fixVersions"]/optgroup/option[2]
    }
}

