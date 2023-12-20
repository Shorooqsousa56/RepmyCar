package f1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features = "use_cases",
  //  tags="tags2",
	plugin = { "summary", "html:target/cucumber/wikipedia.html"} ,
	//monochrome=true, 
	//snippets = SnippetType.CAMELCASE, 
	glue = "f1"
	)


public class ConfigTest {

}
