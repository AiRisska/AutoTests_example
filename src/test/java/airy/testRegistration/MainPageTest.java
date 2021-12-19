package airy.testRegistration;

import airy.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.*;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("MainPage")
@Feature("Main page work")
public class MainPageTest extends TestBase {


    @Test
    @Description("Test: проверка текста в header страницы")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Открытие url 'https://www.sdvor.com/'", () ->
                open("https://www.sdvor.com/"));

        step("Заголовок страницы содержит текст: 'Строительный Двор – интернет-магазин стройматериалов'", () -> {
            String expectedTitle = "Строительный Двор – интернет-магазин стройматериалов";
            String actualTitle = title();

            Assertions.assertThat(actualTitle).contains(expectedTitle);
        });
    }

    @Test
    @Description("Тест: проверка на наличие ошибок в консоли сайта")
    @DisplayName("Наличие ошибок в консоли страницы")
    void consoleShouldNotHaveErrorsTest() {
        step("Открытие url 'https://www.sdvor.com/'", () ->
                open("https://www.sdvor.com/"));

        step("В логах отсутствует текст: 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @ParameterizedTest
    @ValueSource(strings={"Москва", "Тюмень"})
    @Description("Изменение местоположения")
    @DisplayName("Открытие сайта в разных городах")
    void cityName(String city) {
        parameter("Город", city);
        step("Открываем главную страницу в городе " + city, () ->
                open("https://www.sdvor.com/"));

        step("Вводим название города " + city, () -> {
                    $(".c1t3vyg5").click();
                    $(byName("cityName")).click();
                    $(byName("cityName")).val(city);
                    $(".l1lxs5ep").find(byText(city)).click();
                });
        step("Проверяем, что на сайте местоположение по городу " + city, () -> {
            $(".c1t3vyg5").shouldHave(Condition.text(city));

        });
    }

    @Test
    @Description("Открытие каталога товаров")
    @DisplayName("Открытие меню каталога")
    void catalogMenuIsVisible() {
        step("Открываем главную страницу", () -> {
            open("https://www.sdvor.com/?city=tmn");
            //$(".c172s2wi").click();
        });

        step("Нажатие на 'Каталог'", () ->
//                $(".ccguyf0").click()
                        $(".hzyb9p1").click()
        );

        step("Проверка, что в списке есть подпункт 'Строительные смеси, грунтовки' ", () -> {
            String expectedTitle = "Строительные смеси, грунтовки";
            $(".d1lch2e").shouldHave(Condition.text(expectedTitle));
        });
    }
}
