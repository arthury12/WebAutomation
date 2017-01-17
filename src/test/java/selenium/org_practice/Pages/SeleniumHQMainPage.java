package selenium.org_practice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Arthur on 1/16/17.
 */
public class SeleniumHQMainPage {

    @Autowired
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/h2[1]")
           public WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"menu_projects\"]/a")
    public WebElement projectsTab;

    @FindBy(xpath = "//*[@id=\"menu_download\"]/a")
    public WebElement downloadTab;

    @FindBy(xpath = "//*[@id=\"menu_documentation\"]/a")
    public WebElement documentationTab;

    @FindBy(xpath = "//*[@id=\"menu_support\"]/a")
    public WebElement supportTab;

    @FindBy(xpath = "//*[@id=\"menu_about\"]/a")
    public WebElement aboutTab;

    @FindBy(xpath = "//*[@id=\"header\"]/h1/a")
    public WebElement broswerAutomationIcon;

    public SeleniumHQMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void moveToProjectsTab() {
        projectsTab.click();
    }
}
