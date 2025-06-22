package serializationAndDeserialization;

import io.restassured.RestAssured;
import io.restassured.internal.mapping.Jackson1Mapper;
import io.restassured.path.json.mapper.factory.Jackson1ObjectMapperFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Serialization {

    //data is obtained




    @Test
    public void serialization() {
        Map<String , Object> jsonBody = new HashMap<String , Object>();
        List<Object> list = new ArrayList<Object>();
        list.add("AMS");
        list.add("CHQ");
        jsonBody.put("FirstName", "John Doe");
        jsonBody.put("lastName", "Doe");
        jsonBody.put("UserName", "EthanHunt007");
        jsonBody.put("Password", "Ethan@123234");
        jsonBody.put("Access", list);

        RestAssured.given()
                .body(jsonBody)
                .contentType("application/json")
                .baseUri("http://localhost:3000/").log().all()
                .when()
                .post("users").prettyPrint();




    }

}
