package rf.ivonin.rest_assured;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class Configuration {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {

        RestAssured.basePath = "basePath";
        RestAssured.requestSpecification = Specification.requestSpecification();

    }
}
