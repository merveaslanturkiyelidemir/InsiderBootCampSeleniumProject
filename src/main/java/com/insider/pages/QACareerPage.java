package com.insider.pages;

import org.openqa.selenium.WebDriver;

public class QACareerPage extends BasePage {
    
    public QACareerPage(WebDriver driver) {
        super(driver);
    }

    public void filterJobsByLocation() {
        elementHelper.click("seeAllQAjobs");
        elementHelper.click("filterByLocation");
        elementHelper.waitForSeconds(5);
        elementHelper.actionChainClick(elementHelper.findElement("IstanbulTurkiyeFilter"));
        elementHelper.waitForSeconds(2);
        elementHelper.click("blankPage");
    }

    public boolean verifyJobTitles() {
        return elementHelper.verifyTextInElements("jobTitles", "Quality Assurance");
    }

    public boolean verifyJobLocations() {
        return elementHelper.verifyTextInElements("jobLocations", "Istanbul, Turkiye");
    }

    public void applyForFirstJob() {
        elementHelper.hoverElement("jobCard");
        elementHelper.click("viewRole");
    }

    public boolean verifyLeverDomain() {
        elementHelper.waitForSeconds(2);
        return elementHelper.verifyDomain("jobs.lever.co");
    }

    public boolean verifyHomePageDomain() {
        return elementHelper.verifyDomain("useinsider.com");
    }
}
