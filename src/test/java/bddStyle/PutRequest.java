package bddStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PutRequest {
    @Test
    public void putRequestBDD()
    {
        RestAssured.
                given().
                baseUri("http://localhost:3000").
                contentType("application/json").
                body("{\n" +

                        "    \"FirstName\": \"Yugandhar1\",\n" +
                        "    \"lastName\": \"V G\",\n" +
                        "    \"UserName\": \"Yugandhar12341\",\n" +
                        "    \"Password\": \"YUga@123234\"\n" +
                        "}\n ").
                when().
                put("/users/1").prettyPrint();

    }
}
