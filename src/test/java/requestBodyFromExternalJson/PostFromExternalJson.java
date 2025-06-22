package requestBodyFromExternalJson;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class PostFromExternalJson {

    @Test
    public void testPostFromExternalJson() {

        File jsonFile = new File("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\payload.json");
        RestAssured
                .given()
                .contentType("application/json")
                .body(jsonFile)
                .baseUri("http://localhost:3000")
                .when()
                .post("/users")
                .prettyPrint();
    }
}
