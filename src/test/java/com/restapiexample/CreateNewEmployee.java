package com.restapiexample;

import io.restassured.response.Response;
import model.RestApiExample_Pojo;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class CreateNewEmployee extends TestBase {
//1595
    @Test
    public void CreateNewEmployeeRecord() {
        RestApiExample_Pojo restApiExample_pojo = new RestApiExample_Pojo();
        restApiExample_pojo.setName("Employee3");
        restApiExample_pojo.setAge(45);
        restApiExample_pojo.setSalary(65000);
        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiExample_pojo)
                .when()
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
