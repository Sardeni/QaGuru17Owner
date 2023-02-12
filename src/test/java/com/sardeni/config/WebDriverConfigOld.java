package com.sardeni.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
public class WebDriverConfig {

    public String getBaseUrl() {
        // Зачитываем значения из настроек
        String baseUrl = System.getProperty("baseUrl");
        // проверяем дефолтные значения
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
        // Возвращаем результат
        return baseUrl;
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        return Browser.valueOf(browser);
    }

    public URL getRemoteURL() {
        String remoteUrl = System.getProperty("remoteUrl");
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "http://localhost:4444";
        }
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
         throw new RuntimeException(e);
        }
    }


}
