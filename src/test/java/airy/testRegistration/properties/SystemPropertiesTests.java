package airy.testRegistration.properties;

import airy.config.ConfigProject;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemPropertiesTests {

    //задаем несколько параметров через запятую
    @Test
    @Tag("properties")
    void someTest5() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300x300");
        System.out.println("Browser "+browser+" ver. "+version+" size "+browserSize);
        //в командной строке введем другие данные
        //gradle clean properties_tests -Dbrowser=opera -Dversion=93
        //ответ:    Browser opera ver. 93 size 300x300
    }
    public ConfigProject credentials = ConfigFactory.create(ConfigProject.class);
    @Test
    void readCredentialsTest() {
        String login = credentials.login();
        String password = credentials.password();
        System.out.println("Login "+login);
        System.out.println("Password "+password);
        String message = format("I login as %s with password %s", login, password);
        System.out.println(message);
    }
}
