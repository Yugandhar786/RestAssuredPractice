package bddStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostRequest {

    @Test
    public void postRequestBDD()
    {

        RestAssured.
                given()
                .baseUri("http://localhost:3000")
                .contentType("application/json")
                .body(" {\n" +
                        "    \"FirstName\": \"Yugandhar1\",\n" +
                        "    \"lastName\": \"V G\",\n" +
                        "    \"UserName\": \"Yugandhar1234\",\n" +
                        "    \"Password\": \"YUga@123234\"\n" +
                        "  }")
                .when()
                .post("/users")
                .prettyPrint();
    }
}
