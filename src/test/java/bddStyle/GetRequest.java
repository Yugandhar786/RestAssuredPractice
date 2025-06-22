package bddStyle;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetRequest {

    @Test
    public void getRequest()
{

    RestAssured.
                given()
                .baseUri("http://localhost:3000")
                .contentType("application/json")
                .when()
                .get("/users")
                .prettyPrint();
    }
}
