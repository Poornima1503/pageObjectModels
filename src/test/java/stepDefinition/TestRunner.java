package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\poorn\\IdeaProjects\\pageObjectModels\\src\\test\\Features\\",
        glue={"stepDefinition"},
        tags={""},
        //tags= {},
        plugin = {"pretty","html:target/destination" +""}
)
public class TestRunner {
}
