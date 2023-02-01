package com.sardeni;

import com.sardeni.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

    @Test
    public void testGithub() {

        String title = driver.getTitle();
        assertEquals( "GitHub: Let’s build from here · GitHub", title);
    }


}
