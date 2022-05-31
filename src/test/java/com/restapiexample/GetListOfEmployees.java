package com.restapiexample;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetListOfEmployees extends TestBase {

    @Test
    public void getAllEmployees(){
        Response response= given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
