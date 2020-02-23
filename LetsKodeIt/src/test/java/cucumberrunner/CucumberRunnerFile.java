
package cucumberrunner;


        import io.cucumber.testng.AbstractTestNGCucumberTests;
        import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/FeatureFile/HomePage.feature"},
        glue = {"stepdefinations"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,
        monochrome = true,
        tags={}

)

class CucumberRunner extends AbstractTestNGCucumberTests {
}