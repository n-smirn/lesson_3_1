
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

        import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;

 public class SearchGoogle {
        @BeforeAll
        static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        }
        @Test
        void searchTest () {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
        }
        //отличается строка
     //отличается строка
        }