package gotinder.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Arthur on 1/17/17.
 */
public class MainPage {

    @Autowired
    WebDriver driver;

    // Main page elements
    @FindBy(xpath = "/html/body/ui-view/div/div[1]/img")
    public WebElement flameLogo;

    @FindBy(xpath = "/html/body/ui-view/div/div[1]/download-buttons/div/a[1]/img")
    public WebElement appleStoreIcon;

    @FindBy(xpath = "/html/body/ui-view/div/div[1]/download-buttons/div/a[2]/img")
    public WebElement googlePlayStoreIcon;

    @FindBy(xpath = "/html/body/ui-view/div/div[1]/div[5]/div/img")
    public WebElement dropDownArrow;

    @FindBy(xpath = "/html/body/ui-view/div/div[1]/div[4]/div")
    public WebElement languageSelectorDropdown;

    // Drop down
    @FindBy(xpath = "/html/body/ui-view/div/div[1]/div[4]/div")
    public WebElement download;

    @FindBy(xpath = "//*[@id=\"home-nav\"]/section[1]/ul/li[1]/a")
    public WebElement downloadiOSLink;

    @FindBy(xpath = "//*[@id=\"home-nav\"]/section[1]/ul/li[2]/a")
    public WebElement downloadAndroidLink;


    @FindBy(xpath = "//*[@id=\"home-nav\"]/section[2]/h5")
    public WebElement community;

    @FindBy(xpath = "//*[@id=\"home-nav\"]/section[2]/ul/li[1]/a")
    public WebElement blogLink;

    @FindBy(xpath = "//*[@id=\"home-nav\"]/section[2]/ul/li[2]/a")
    public WebElement techBlogLink;

    @FindBy(xpath = "//*[@id=\"home-nav\"]/section[2]/ul/li[3]/a")
    public WebElement pressLink;

    @FindBy(xpath = "//*[@id=\"home-nav\"]/section[2]/ul/li[4]/a")
    public WebElement supportLink;

}
