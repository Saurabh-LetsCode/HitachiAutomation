package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
    public Properties properties;

    public BaseTest(Properties properties){
        this.properties = properties;
    }


    public WebDriver webDriverManager() throws IOException {

        if(driver == null) {

            if(properties.getProperty("browser").equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
            } else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }

            driver.manage().window().maximize();
        }

        return driver;
    }
}
