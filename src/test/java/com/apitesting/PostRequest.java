package api;

import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostRequest {
    @Test
    public void testCreatePost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given().
            header("Content-type", "application/json").
            body("{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }").
        when().
            post("/posts").
        then().
            statusCode(201).
            body("title", equalTo("foo"));
    }
}
