package com.Lits.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverContext {

    private static WebDriver webDriver; // singeltorn patern

    public static WebDriver getDriver() {

        if (webDriver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("lang=en");
            webDriver = new ChromeDriver(chromeOptions);
            webDriver
                    .manage()
                    .timeouts()
                    .implicitlyWait(30, TimeUnit.SECONDS);
        }
        return webDriver;
    }

    public static void loadURL(String url){
        getDriver().get(url);
    }

    public static void stop() { // вихід з драйвера
        getDriver().quit();
        webDriver = null;

    }


}
