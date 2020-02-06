package eu.ddd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber","summary"}, strict = true, snippets = CAMELCASE)
public class CucumberTest {
}
