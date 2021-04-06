package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    void googleSearchTest() {
        open("https://www.google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $("body").shouldHave(Condition.text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
