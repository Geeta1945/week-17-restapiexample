package testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void loadIt(){

        RestAssured.baseURI ="https://dummy.restapiexample.com";
        RestAssured.basePath="/api/v1";
    }
}
