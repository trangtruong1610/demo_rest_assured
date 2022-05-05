package base;

import io.restassured.RestAssured;
import org.junit.Before;

public class BaseClass {

    @Before
    public void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.basePath = "/student";
        RestAssured.port = 8080;
    }
}
