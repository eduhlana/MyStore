package exec;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

	
@RunWith(Cucumber.class)
@Cucumber.Options(
	       features = "features",//path to the features
	       tags = {"@register"},
	       glue = {"steps"})//what tags to incluse(@)/exclude(@~)

public class RegisterTest {
}


