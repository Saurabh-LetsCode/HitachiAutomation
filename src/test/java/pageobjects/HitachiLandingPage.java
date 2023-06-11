package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Properties;

public class HitachiLandingPage {

    WebDriver driver;
    Properties properties;

    public HitachiLandingPage(WebDriver driver, Properties properties){
        this.driver = driver;
        this.properties = properties;
    }

    private By contactUSLandingPage = By.xpath("//ul[@id='menu-main']/following-sibling::ul/li/a");
    private By addressIrvineUSA = By.xpath("(//h4[contains(text(),'Hitachi Solutions America')]/following-sibling::p/a)[1]");

    public void click(String contactUS) throws Exception {

        switch (contactUS.toLowerCase()) {
            case "contact us":
                driver.findElement(contactUSLandingPage).click();
                break;
            default:
                System.out.println("Incorrect button name provided");
                break;
        }
    }

    public void verifyAddress(){

        String expectedAddress = driver.findElement(addressIrvineUSA).getText();
        String actualAddress = properties.getProperty("HITACHI_ADDRESS");
        Assert.assertEquals(actualAddress,expectedAddress);

    }
}
