package com.insider.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.insider.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Verify Home Page Elements")
    public void verifyHomePageElements() {
        HomePage homePage = new HomePage(driver);
        
        homePage.navigateToHomePage();
        assertTrue(homePage.verifyDomain(), "Should be on Insider homepage");
        assertTrue(homePage.isAnnounceBarVisible(), "Announce bar should be visible on Insider homepage");
    }
}

