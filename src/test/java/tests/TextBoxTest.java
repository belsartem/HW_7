package tests;

import helpers.BaseTestSettings;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTestSettings {

    TextBoxPage testBoxPage = new TextBoxPage();

    @Test
    void successfulTestBoxTest() {
        testBoxPage.openPage()
                .setFullName("Test Testov")
                .setEmail("test@gmail.com")
                .setCurrentAddress("Test Current Address")
                .setPermanentAddress("Test Permanent Address")
                .pressSubmit();

        testBoxPage.checkTextBoxResult("Name","Test Testov")
                .checkTextBoxResult("Email","test@gmail.com")
                .checkTextBoxResult("Current Address","Test Current Address")
                .checkTextBoxResult("Permananet Address","Test Permanent Address");
    }
}