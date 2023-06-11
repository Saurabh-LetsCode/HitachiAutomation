package utilities;

import pageobjects.PageObjectManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ScenarioContext {

    public PageObjectManager pageObjectManager;
    public BaseTest baseTest;
    public Actions action;
    public Properties properties;

    public ScenarioContext() throws IOException {

        FileInputStream fis = new FileInputStream("src//test//resources//global.properties");
        properties = new Properties();
        properties.load(fis);

        baseTest = new BaseTest(properties);
        pageObjectManager = new PageObjectManager(baseTest.webDriverManager(),properties);
        action = new Actions(baseTest.webDriverManager());

    }

}
