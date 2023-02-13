package com.sardeni;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.sardeni.config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.VacancyPage;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    VacancyPage vacancyPage = new VacancyPage();

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListenerAndOpenPage() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("/vacancy/75860919");
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}