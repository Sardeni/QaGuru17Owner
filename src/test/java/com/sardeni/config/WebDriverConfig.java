package com.sardeni.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})

public interface WebDriverConfig extends Config {

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserName")
    String getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("pageLoadStrategy")
    @DefaultValue("eager")
    String getPageLoadStrategy();
}