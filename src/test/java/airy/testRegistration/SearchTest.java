package airy.testRegistration;

import airy.TestBase;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("search")
public class SearchTest extends TestBase {


    @Test
    @Description("Search test")
    @DisplayName("Page should have field 'Поиск'")
    void pageShouldHaveFieldSearch() {
        step("Open url 'https://www.sdvor.com/'", () ->
                open("https://www.sdvor.com/"));

        step("Page should have field 'Поиск'", () -> {
            $(byName("search")).shouldBe(Condition.visible);
        });
    }

    @ParameterizedTest
    @ValueSource(strings={"обои", "клей"})
    @Description("Search test")
    @DisplayName("Search text")
    void consoleShouldNotHaveErrorsTest(String value) {
        step("Open url 'https://www.sdvor.com/'", () ->
                open("https://www.sdvor.com/"));

        step("Поиск по значению "+value, () -> {
            $(byName("search")).click();
            $(byName("search")).setValue(value).pressEnter();
            $(".tysidwl").shouldHave(Condition.text(value));
        });
    }
}
