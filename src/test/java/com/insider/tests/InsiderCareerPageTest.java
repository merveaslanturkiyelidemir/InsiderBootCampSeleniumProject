package com.insider.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.insider.pages.QACareerPage;

public class InsiderCareerPageTest extends BaseTest {

    @Test
    @DisplayName("Verify QA Career Page and Job Application Process")
    public void filterCareerJobs() {
        QACareerPage qaCareerPage = new QACareerPage(driver);
        
        elementHelper.navigateToUrl("https://useinsider.com/careers/quality-assurance/");
        
        qaCareerPage.filterJobsByLocation();

        assertTrue(qaCareerPage.verifyJobLocations(), 
            "All job locations should be 'Istanbul, Turkey'");

        
        elementHelper.waitForSeconds(2);
        
        assertTrue(qaCareerPage.verifyJobTitles(), 
            "All job titles should contain 'Quality Assurance'");
        
            
        qaCareerPage.applyForFirstJob();
        
        assertTrue(qaCareerPage.verifyLeverDomain(), 
            "Should be redirected to Lever job application page");
    }
}
