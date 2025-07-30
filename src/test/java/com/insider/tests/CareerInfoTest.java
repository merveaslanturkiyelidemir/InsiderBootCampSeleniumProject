package com.insider.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.insider.pages.CareerPage;
import com.insider.pages.HomePage;

public class CareerInfoTest extends BaseTest {

    @Test
    @DisplayName("Verify Career Page Elements")  
    public void verifyCareerPageElements() {
        HomePage homePage = new HomePage(driver);
        CareerPage careerPage = homePage.navigateToCareerPage();
        
        careerPage.clickSeeAllTeams();
        
        assertTrue(careerPage.verifyTeamsBlockVisible(), 
            "'All Teams' block should be visible");
        assertTrue(careerPage.verifyLocationBlockVisible(), 
            "'Career Location' block should be visible");
        assertTrue(careerPage.verifyLifeAtInsiderBlockVisible(), 
            "'Life at Insider' block should be visible");
    }
}
