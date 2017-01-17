package selenium.org_practice.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.org_practice.Pages.SeleniumHQMainPage;
import selenium.org_practice.Pages.SeleniumProjectsPage;
import selenium.org_practice.Support.SeleniumHQ;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by Arthur Yu on 1/15/2017.
 */
public class seleniumWebDocTest {
    public WebDriver driver;
    private SeleniumHQ seleniumHQ;
    private String urlToBeTested = "http://www.seleniumhq.org";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/h2c/code/WebAutomation/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testVerifyMainPage() throws Exception {
        seleniumHQ = new SeleniumHQ(driver, urlToBeTested);
        SeleniumHQMainPage seleniumMainPage = new SeleniumHQMainPage(driver);

        assertTrue("Selenium page title isn't displayed.", seleniumMainPage.pageTitle.getText().equals("What is Selenium?"));
        assertTrue("Browser Automation icon text is incorrect.", seleniumMainPage.broswerAutomationIcon.getText().equals("Browser Automation"));
        assertTrue("Projects tab isn't displayed", seleniumMainPage.projectsTab.isDisplayed() == true);
        assertTrue("Download tab isn't displayed", seleniumMainPage.downloadTab.isDisplayed() == true);
        assertTrue("Documentation tab isn't displayed", seleniumMainPage.documentationTab.isDisplayed() == true);
        assertTrue("Support tab isn't displayed", seleniumMainPage.supportTab.isDisplayed() == true);
        assertTrue("About tab isn't displayed", seleniumMainPage.aboutTab.isDisplayed() == true);
    }

    @Test
    public void testVerifyProjectPage() throws Exception {
        seleniumHQ = new SeleniumHQ(driver, urlToBeTested);
        SeleniumHQMainPage seleniumMainPage = new SeleniumHQMainPage(driver);

        seleniumMainPage.moveToProjectsTab();
        SeleniumProjectsPage seleniumProjectsPage = new SeleniumProjectsPage(driver);

        assertTrue("Projects title isn't displayed.", seleniumProjectsPage.isPageDisplayed() == true);
        assertTrue("Web driver link isn't displayed.", seleniumProjectsPage.webDriverLink.isDisplayed() == true);
        assertTrue("Grid link isn't displayed.", seleniumProjectsPage.seleniumGridLink.isDisplayed() == true);
        assertTrue("IDE link isn't displayed.", seleniumProjectsPage.seleniumIDELink.isDisplayed() == true);
        assertTrue("Remote Control link isn't displayed.", seleniumProjectsPage.seleniumRemoteControlLink.isDisplayed() == true);
    }
}