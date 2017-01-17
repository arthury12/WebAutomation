package selenium.org_practice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Arthur on 1/16/17.
 */
public class SeleniumProjectsPage {

    @Autowired
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/h2")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/h3[1]/a")
    public WebElement webDriverLink;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/h3[2]/a")
    public WebElement seleniumGridLink;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/h3[3]/a")
    public WebElement seleniumIDELink;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/h3[4]/a")
    public WebElement seleniumRemoteControlLink;

    public SeleniumProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageDisplayed() {
        return pageTitle.isDisplayed();
    }
}
