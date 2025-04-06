package api;

import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetRequest {
    @Test
    public void testGetPostById() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given().
        when().
            get("/posts/1").
        then().
            statusCode(200).
            body("id", equalTo(1));
    }
}
