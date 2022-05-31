package com.restapiexample;

import io.restassured.response.Response;
import model.RestApiExample_Pojo;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteEmployee extends TestBase {
    @Test
    public void deleteEmployee(){
        RestApiExample_Pojo restApiExample_pojo = new RestApiExample_Pojo();
        Response response =given()
                .pathParam("id",5688)
                .header("Content-Type", "application/json")
                .when()
                .delete("/delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
