package airy.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/remote.properties"
})
public interface ConfigProject extends Config {
    String url();
    String login();
    String password();
    @DefaultValue("chrome")
    String browser();
    @DefaultValue("1920x1080")
    String browserSize();
    String videoStorage();

}
