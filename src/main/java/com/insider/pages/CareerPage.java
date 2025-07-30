package com.insider.pages;

import org.openqa.selenium.WebDriver;

public class CareerPage extends BasePage {
    
    public CareerPage(WebDriver driver) {
        super(driver);
    }

    public void clickSeeAllTeams() {
        elementHelper.moveToElementAndClickWithJs("seeAllTeams");
    }

    public boolean verifyTeamsBlockVisible() {
        return elementHelper.isElementVisible("AllTeamsBlock");
    }

    public boolean verifyOpenPositionsBlockVisible() {
        return elementHelper.verifyTextInElements("openPositionsBlock", "Open Positions");
    }

    public boolean verifyLocationBlockVisible() {
        return elementHelper.isElementVisible("careerLocationBlock");
    }

    public boolean verifyLifeAtInsiderBlockVisible() {
        return elementHelper.isElementVisible("lifeAtInsiderBlock");
    }
}
