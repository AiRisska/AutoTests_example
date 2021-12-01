package airy.testRegistration;

import airy.TestBase;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.SearchContext;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("ProductCard")
@Feature("Product Card")
public class ProductCardTest extends TestBase {


    @Test
    @Description("Product Card test")
    @DisplayName("Search and move in the Product Card")
    void searchAndMoveOnProductCard() {
        step("Open url 'https://www.sdvor.com/'", () ->
                open("https://www.sdvor.com/"));
        step("Search 'шуруп'", () -> {
            $(byName("search")).click();
            $(byName("search")).setValue("шуруп").pressEnter();
            $(".tysidwl").shouldHave(text("шуруп"));
        });

        step("Move to page of product card", () -> {
            $(byAttribute("data-testid","ProductLinkTitle")).click();
            $(".p1mat1o1").shouldHave(text("шуруп"));
        });
    }

    @ParameterizedTest
    @ValueSource(strings={"Код товара", "Цена за шт"})
    @Description("Test Product Card")
    @DisplayName("Search product parameter {0}")
    void cardShouldHaveAttribute(String value) {
        step("Open product card 'Шуруп'", () ->
                open("https://www.sdvor.com/tmn/product/shurup-s-shestigrannoj-golovkoj-12h140-mm-66842/"));

        step("Поиск параметра товара по значению "+value, () -> {
            $(byAttribute("data-testid","ProductCardMain"))
                    .shouldHave(text(value));
        });
    }
}
