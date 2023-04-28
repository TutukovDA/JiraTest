package ElementsTest;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BaseElements {

    public static SelenideElement BaseInput(String atribute, String value) {
        return $x("//input[" + atribute + "='" + value + "']");
    }

    //a[@aria-controls='browse_link-content']
    public static SelenideElement BaseButton(String teg, String atribute, String value) {
        return $x("//" + teg + "[" + atribute + "='" + value + "']");
    }

    public static SelenideElement BaseGetText(String atribute, String value) {
        return $x("//" + atribute + "[contains(text(),'" + value + "')]");
    }
}

