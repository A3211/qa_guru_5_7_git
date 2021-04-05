package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    void googleSearchTest() {
        open("https://www.google.com");
    }
}
