package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.ResultTextBoxComponent;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    public TextBoxPage openPage() {
        String textBoxPageURL = "/text-box";
        open(textBoxPageURL);
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    private final SelenideElement
            fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");

    ResultTextBoxComponent resultTextBoxComponent = new ResultTextBoxComponent();

    public TextBoxPage setFullName(String value) {
        fullNameInput.setValue(value);
        return this;
    }

    public TextBoxPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public void pressSubmit() {
        submitButton.click();
    }

    public TextBoxPage checkTextBoxResult (String key, String value) {
        resultTextBoxComponent.checkTextBoxResult(key, value);
        return this;
    }
}