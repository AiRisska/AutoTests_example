package airy.testRegistration;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("ShoppingCart")
@Feature("Shopping Cart")
public class ShoppingCartTest extends TestBase {

    @Test
    @Description("Корзина для покупок на главной странице")
    @DisplayName("Проверка на наличие корзины на главной странице")
    void mainPageShouldHaveShoppingCartTest() {
        step("Открытие url 'https://www.sdvor.com/'", () ->
                open("https://www.sdvor.com/"));
        step("Поиск текста 'Корзина' в блоке", () -> {
            $(".c1hh5p11").shouldHave(text("Корзина"));
        });
    }

    @Test
    @Description("Открытие и переход в корзину")
    @DisplayName("Открытие и переход в корзину из карточки продукта")
    void openAndMoveShoppingCartTest() {
        step("Открыть карточки продукта 'Шуруп'", () ->
                open("https://www.sdvor.com/tmn/product/shurup-s-shestigrannoj-golovkoj-12h140-mm-66842/"));

        step("Добавить товар в корзину", () -> {
            $(byAttribute("data-testid","AddToCart"))
                    .click();
            $(byAttribute("data-testid","ProductCount"))
                    .shouldBe(visible);
        });

        step("Переход в корзину", () -> {
            $(".txxe994").click();
            $(".toaa97n").shouldHave(text("Корзина"));
        });

        step("Наличие товара в корзине", () ->{
            $(byAttribute("data-testid","CartPosition")).shouldHave(text("шуруп"));
        });

        step("Блок с итогами", () ->{
            $("#total").shouldHave(text("Итого"));
        });

        step("Кнопка перехода к оформлению", () ->{
            $(".fwtcmok").shouldBe(visible);
            $(".b1bczx8b").shouldHave(text("Перейти к оформлению"));
        });
    }

}
