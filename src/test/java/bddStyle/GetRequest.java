package bddStyle;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetRequest {

    @Test
    public void getRequest()
    {
                given()
                .baseUri("http://localhost:3000")
                .contentType("application/json")
                .when()
                .get("/users")
                .prettyPrint();
    }
}
