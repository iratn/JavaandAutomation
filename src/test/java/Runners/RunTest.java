package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/features/Scenario.feature",
        glue = {"Steps"},
        tags = "@functional"
)

public class RunTest extends AbstractTestNGCucumberTests{
}
