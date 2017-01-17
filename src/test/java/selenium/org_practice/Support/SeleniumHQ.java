package selenium.org_practice.Support;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Arthur Yu on 1/15/2017.
 */
public class SeleniumHQ {
    private WebDriver driver;
    private String baseUrl;

    public SeleniumHQ(WebDriver driver, String url) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url + "/");
    }
}