package MethodChaining;

import io.restassured.http.Method;
import io.restassured.response.Response;
import static  io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class MethodChaining {

    @Test
    public void methodChaining() {

        Response response= given().request(Method.DELETE,"http://localhost:3000/users/1");


    }
}
