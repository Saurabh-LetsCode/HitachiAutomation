package myrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        monochrome = true,
        features = {"src/test/java/features"},
        glue = "stepdefinition",
        tags = "@AddressNameVerification_USA",
        plugin = {"pretty", "html:target/HTMLReports.html"}

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
