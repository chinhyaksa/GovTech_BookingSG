import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/booking/Services.feature",
        glue = "stepdef",
        tags = ""
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
