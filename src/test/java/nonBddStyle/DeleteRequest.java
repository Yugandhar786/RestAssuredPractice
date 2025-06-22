package nonBddStyle;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
    public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000/";

        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.DELETE,"users/2");
        System.out.println(response.getStatusLine());
        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());
//        System.out.println(response.asString());
    }
}
