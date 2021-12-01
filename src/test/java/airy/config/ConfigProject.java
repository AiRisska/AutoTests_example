package airy.config;

import org.aeonbits.owner.Config;

//@Config.Sources({"classpath:config/hw.properties"})

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
//        "system:properties",
//        "classpath:config/local.properties",
        "classpath:config/remote.properties"
})
public interface ConfigProject extends Config {
    String url();
    String login();
    String password();
    @DefaultValue("chrome")
    String browser();
    @DefaultValue("91.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
//    String browserMobileView();
//    String remoteDriverUrl();
//    String videoStorage();

}
