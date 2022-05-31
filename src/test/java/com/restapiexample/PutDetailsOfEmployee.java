package com.restapiexample;

import io.restassured.response.Response;
import model.RestApiExample_Pojo;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PutDetailsOfEmployee extends TestBase {
    @Test
            public void patchEmployeeInfo() {

        RestApiExample_Pojo restApiExample_pojo = new RestApiExample_Pojo();
        restApiExample_pojo.setAge(36);
        restApiExample_pojo.setName("Jesika");
        restApiExample_pojo.setSalary(61000);

        Response response=given()
                .header("Content-Type","application/json")
                .body(restApiExample_pojo)
                .when()
                .put("/update/1595");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
