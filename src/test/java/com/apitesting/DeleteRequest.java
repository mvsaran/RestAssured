package api;

import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class DeleteRequest {
    @Test
    public void testDeletePost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        when().
            delete("/posts/1").
        then().
            statusCode(200); // or 204 depending on API
    }
}
