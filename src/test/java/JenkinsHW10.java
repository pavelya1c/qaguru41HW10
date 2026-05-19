import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;


public class JenkinsHW10 {

    private static String domain = "https://github.com";
    @Test
    public void test() {
        open("https://github.com");
        System.out.println("Привет" + " " + domain);
    }
}
