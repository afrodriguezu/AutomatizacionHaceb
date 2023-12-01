package com.haceb.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Esperas {

    public static void espera1(WebDriver webDriver, WebElementFacade webElementFacade) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        wait.until(
                ExpectedConditions.elementToBeClickable(webElementFacade)
        );
    }

    public static void espera2(WebDriver webDriver, WebElementFacade webElementFacade) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(
                ExpectedConditions.elementToBeClickable(webElementFacade)
        );
    }

    public static void espera3(WebDriver webDriver, WebElementFacade webElementFacade) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(2));
        wait.until(
                ExpectedConditions.elementToBeClickable(webElementFacade)
        );
    }
}