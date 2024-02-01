import io.cucumber.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/booking/Services.feature",
        glue = "stepdefs",
        tags = "@bookingSG"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
