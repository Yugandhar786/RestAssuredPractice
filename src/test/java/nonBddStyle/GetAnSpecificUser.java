package nonBddStyle;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAnSpecificUser {
    public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000/";
        RequestSpecification request = RestAssured.given();
        Response response = request.get("users/1");
        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());

    }
}
