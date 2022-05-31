package extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class SearchJsonPathExample {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/";
        RestAssured.basePath="/api/v1";
        response = given()
                .when()
                .get("/employees")
                .then().statusCode(200);
    }


    @Test
    public void test001() {
        List<Integer> total_data = response.extract().path("data.id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The total records are : "+total_data.size());
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void test2(){
        int id = response.extract().path("data[23].id");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The id of 24th record is : "+id);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test3(){
        String name = response.extract().path("data[23].employee_name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The employee name of 24th data is : "+name);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test4(){
        String message = response.extract().path("message");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The message on page is : "+message);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test5(){
        String status = response.extract().path("status");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The status is : "+status);
        System.out.println("------------------End of Test---------------------------");

    }
    @Test
    public void test6(){
        List<Integer> salary = response.extract().path("data.findAll{it.id==3}.employee_salary");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The salary of 4th employee is : "+salary);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void test7(){
        List<Integer> age = response.extract().path("data.findAll{it.id==6}.employee_age");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The age of employee with id no 6 is : "+age);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void test8(){

        List<String> name= response.extract().path("data.findAll{it.id==11}.employee_name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The name of emploee with employee id -11 is : "+name);
        System.out.println("------------------End of Test---------------------------");

    }


}
