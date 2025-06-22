package nonBddStyle;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequests {
    public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000/";
        RequestSpecification request = RestAssured.given();
        Response response = request.request(Method.GET,"users");
        Response response1 = request.request(Method.GET,"Access");
        System.out.println(response.asPrettyString());
        System.out.println(response.asString());
        System.out.println(response.statusCode());

        System.out.println(response1.asPrettyString());
        System.out.println(response1.asString());
        System.out.println(response1.statusCode());

    }
}
