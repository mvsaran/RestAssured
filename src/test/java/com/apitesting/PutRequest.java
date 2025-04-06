package api;

import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutRequest {
    @Test
    public void testUpdatePost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given().
            header("Content-type", "application/json").
            body("{ \"id\": 1, \"title\": \"updated\", \"body\": \"bar\", \"userId\": 1 }").
        when().
            put("/posts/1").
        then().
            statusCode(200).
            body("title", equalTo("updated"));
    }
}
