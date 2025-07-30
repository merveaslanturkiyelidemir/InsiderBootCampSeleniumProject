package com.insider.pages;

import org.openqa.selenium.WebDriver;

import com.insider.helper.ElementHelper;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final ElementHelper elementHelper;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }
}
