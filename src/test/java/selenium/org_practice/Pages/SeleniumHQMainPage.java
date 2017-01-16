package selenium.org_practice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Arthur on 1/16/17.
 */
public class SeleniumHQMainPage {
    /*
    Having a symbolic page object model, the xpaths here should be WebElements.
    TODO: Will need to autowire an instance of chrome driver into file.
     */
    public String pageTitleXPath = "//*[@id=\"mainContent\"]/h2[1]";
    public String projectsTabXPath = "//*[@id=\"menu_projects\"]/a";
    public String DownloadTabXPath = "//*[@id=\"menu_download\"]/a";
    public String DocumentationTabXPath = "//*[@id=\"menu_documentation\"]/a";
    public String SupportTabXPath = "//*[@id=\"menu_support\"]/a";
    public String AboutTabXPath = "//*[@id=\"menu_support\"]/a";
}
