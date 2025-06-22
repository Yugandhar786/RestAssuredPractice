package nonBddStyle;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

    public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000/";
        RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\n" +
                "    \"FirstName\": \"Yugandhar\",\n" +
                "    \"lastName\": \"V G1\",\n" +
                "    \"UserName\": \"Yugandhar1\",\n" +
                "    \"Password\": \"YUga@71\"\n" +
                "  }");
        Response response = requestSpecification.request(Method.POST,"users");

        System.out.println(response.getStatusLine());
        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());




    }
}
