package com.insider.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void navigateToHomePage() {
        driver.get("https://useinsider.com");
    }
    

    public CareerPage navigateToCareerPage() {
        elementHelper.click("company");
        elementHelper.click("career");
        return new CareerPage(driver);
    }

    public boolean verifyDomain() {
        return elementHelper.verifyDomain("https://useinsider.com");
    }

    public boolean isAnnounceBarVisible() {
        return elementHelper.isElementVisible("announceBar");
    }
}
