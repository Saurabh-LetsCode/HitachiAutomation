package stepdefinition;

import io.cucumber.java.After;
import utilities.ScenarioContext;

import java.io.IOException;


public class Hooks {

    ScenarioContext scenarioContext;
    public Hooks(ScenarioContext scenarioContext){
        this.scenarioContext = scenarioContext;
    }


    @After()
    public void afterTest() throws IOException {
        scenarioContext.baseTest.webDriverManager().quit();
    }
}
