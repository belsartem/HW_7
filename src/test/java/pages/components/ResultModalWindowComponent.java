package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultModalWindowComponent {

    public void checkRegistrationResult(String key, String value) {
        $(".table-responsive").$(byText(value)).parent().shouldHave(text(key));
    }

    public void checkTextBoxResult(String key, String value) {
        $("#output").$(byText(value)).parent().shouldHave(text(key));
    }
}