package WebHooks;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class WebHooks {
    @BeforeAll
    public static void setUp() {
        Configuration.startMaximized = true;

    }
}
