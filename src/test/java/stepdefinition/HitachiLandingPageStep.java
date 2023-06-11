package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HitachiLandingPage;
import pageobjects.PageObjectManager;
import utilities.ScenarioContext;


public class HitachiLandingPageStep {

    ScenarioContext scenarioContext;

    public HitachiLandingPageStep(ScenarioContext scenarioContext){
     this.scenarioContext = scenarioContext;
 }

   @Given("I am on Hitachi Website LandingPage")
    public void navigateHitachiLandingPage() throws Exception {
       scenarioContext.baseTest.webDriverManager().get(scenarioContext.properties.getProperty("url"));
    }

    @When("I click on {string} option")
    public void clickOnContactUS(String contactUS) throws Exception {
        HitachiLandingPage hitachiLandingPage = scenarioContext.pageObjectManager.getHitachiLandingPage();
        hitachiLandingPage.click(contactUS);
    }

    @Then("I verify the address field")
    public void verifyAddressLandingPage() throws Exception {
        HitachiLandingPage hitachiLandingPage = scenarioContext.pageObjectManager.getHitachiLandingPage();
        hitachiLandingPage.verifyAddress();
    }

}
