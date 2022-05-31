package com.restapiexample;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetSingleEmployee extends TestBase {

    @Test
    public void getSingleEmployeeDetails(){

        Response response = given()
                .pathParam("id",6)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
