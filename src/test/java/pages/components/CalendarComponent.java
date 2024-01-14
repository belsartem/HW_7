package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {

        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        if(day.equals("30") || day.equals("31")) {
            $(".react-datepicker__day--" + "0" + day + ":not(.react-datepicker__day--outside-month").click();
        } else {
            $(".react-datepicker__month").$(byText(day)).click();
        }
    }
}