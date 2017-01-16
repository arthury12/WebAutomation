package selenium.org_practice.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.org_practice.Pages.SeleniumHQMainPage;
import selenium.org_practice.Pages.SeleniumProjectsPage;
import selenium.org_practice.Support.SeleniumHQ;

import java.util.concurrent.TimeUnit;

/**
 * Created by Arthur Yu on 1/15/2017.
 */
public class seleniumWebDocTest {
    private WebDriver driver;
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
        SeleniumHQMainPage seleniumMainPage = new SeleniumHQMainPage();

        WebElement pageTitle = driver.findElement(By.xpath(seleniumMainPage.pageTitleXPath));
        assertEquals(pageTitle.getText(), "What is Selenium?");
    }

    @Test
    public void testVerifyProjectPage() throws Exception {
        seleniumHQ = new SeleniumHQ(driver, urlToBeTested);
        SeleniumHQMainPage seleniumMainPage = new SeleniumHQMainPage();

        WebElement mainPageTitle = driver.findElement(By.xpath(seleniumMainPage.projectsTabXPath));
        mainPageTitle.click();
        SeleniumProjectsPage seleniumProjectsPage = new SeleniumProjectsPage();
        WebElement projectPageTitle = driver.findElement(By.xpath(seleniumProjectsPage.pageTitleXPath));
        assertEquals(projectPageTitle.getText(), "Selenium Projects");
    }
}