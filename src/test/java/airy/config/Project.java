package airy.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static ConfigProject config = ConfigFactory.create(ConfigProject.class, System.getProperties());

/*    public static boolean isWebMobile() {
        return !config.browserMobileView().equals("");
    }
*/
    public static boolean isRemoteWebDriver() {

        return !config.remoteDriverUrl().equals("");
    }

    public static boolean isVideoOn() {

        return !config.videoStorage().equals("");
    }
}
