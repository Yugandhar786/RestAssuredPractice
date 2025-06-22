package bddStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class DeleteRequest {

    @Test
    public void testDeleteRequestBDD() {
        RestAssured.
                given().
                baseUri("http://localhost:3000/").
                contentType("application/json").
                when().
                delete("users/e875").prettyPrint();
    }
}
