package cucumbertestmain;




import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;





@CucumberOptions(features="src/test/java/features",glue=".",plugin= {"pretty", "html:target/cucumber-reports" },monochrome=true)
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
/*	@DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
 */
}
