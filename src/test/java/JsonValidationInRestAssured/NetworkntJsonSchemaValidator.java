package JsonValidationInRestAssured;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class NetworkntJsonSchemaValidator {

    /** Method is used to validate the Input JSon Against the JsonSchema **/

    @Test
    public void validateJsonSchema() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V4);
        File jsonPayload = new File("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\Input.json");
        InputStream schemaFile = new FileInputStream("C:\\Users\\YUGANDHAR V G\\IdeaProjects\\RestAssuredPractice\\src\\test\\resources\\schema.json");
        JsonNode jsonNode=mapper.readTree(jsonPayload);
        JsonSchema schema =  factory.getSchema(schemaFile);
        Set<ValidationMessage> result = schema.validate(jsonNode);

        if(result.isEmpty())
        {
            System.out.println("No Validation Error");

        }
        else {
            for(ValidationMessage message: result)
            {
                System.out.println(message);

            }
        }

    }
}
