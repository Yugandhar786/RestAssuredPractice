package JsonValidationInRestAssured;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.*;

public class JsonValidationInRestAssured {

    @Test(enabled = false)
    public void validationUsingJsonSchemaInClassPath() {

        File jsonPayload = new File("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\Input.json");

        RestAssured.given()
                .baseUri("http://localhost:3000")
                .contentType("application/json")
                .body(jsonPayload)
                .when()
                .post("/users")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json")).log().all();


    }

    @Test(enabled = true)
    public void validationUsingMatchesJsonSchemaUsingFile() throws FileNotFoundException {

        File jsonPayload = new File("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\Input.json");
        File schemaJson = new File("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\schema.json");

        RestAssured.given()
                .baseUri("http://localhost:3000")
                .contentType("application/json")
                .body(jsonPayload)
                .when()
                .post("/users")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchema(schemaJson)).log().all();



    }
    @Test
    public void validationUsingJsonSchemaUSingInputStream() throws FileNotFoundException {
        File jsonPayload = new File("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\Input.json");
        InputStream schemaJson = new FileInputStream("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\schema.json");

        RestAssured.given()
                .baseUri("http://localhost:3000")
                .contentType("application/json")
                .body(jsonPayload)
                .when()
                .post("/users")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchema(schemaJson)).log().all();


    }

    @Test
    public void validationUsingJsonSchemaUSingReader() throws FileNotFoundException {
        File jsonPayload = new File("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\Input.json");
        Reader schemaJson = new FileReader("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\schema.json");

        RestAssured.given()
                .baseUri("http://localhost:3000")
                .contentType("application/json")
                .body(jsonPayload)
                .when()
                .post("/users")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchema(schemaJson)).log().all();


    }


}
