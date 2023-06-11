package pageobjects;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class PageObjectManager {

    WebDriver driver;
    HitachiLandingPage hitachiLandingPage;
    Properties properties;

    public PageObjectManager(WebDriver driver , Properties properties){
        this.driver = driver;
        this.properties = properties;
    }


    public HitachiLandingPage getHitachiLandingPage(){
        hitachiLandingPage = new HitachiLandingPage(driver , properties);
        return hitachiLandingPage;
    }
}
