import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    public void testGetRequest() {
        Response response = RestAssured.get(BASE_URL + "/get?foo1=bar1&foo2=bar2");

        response.then().statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRawText() {
        String rawText = "This is some raw text content.";

        Response response = RestAssured.given()
                .contentType("text/plain")
                .body(rawText)
                .post(BASE_URL + "/post");

        response.then().statusCode(200)
                .body("data", equalTo(rawText)); // Adjust based on the expected response format
    }

    @Test
    public void testPostFormData() {
        Response response = RestAssured.given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .post(BASE_URL + "/post");

        response.then().statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }


    @Test
    public void testPatchRequest() {
        Response response = RestAssured.given()
                .contentType("application/json")
                .body("{\"foo\":\"updatedValue\"}")
                .patch(BASE_URL + "/patch");

        response.then().statusCode(200)
                .body("json.foo", equalTo("updatedValue"));
    }

    @Test
    public void testPutRequest() {
        Response response = RestAssured.given()
                .contentType("application/json")
                .body("{\"foo\":\"bar\"}")
                .put(BASE_URL + "/put");

        response.then().statusCode(200)
                .body("json.foo", equalTo("bar"));
    }

    @Test
    public void testDeleteRequest() {
        Response response = RestAssured.delete(BASE_URL + "/delete?foo=bar");

        response.then().statusCode(200)
                .body("args.foo", equalTo("bar"));
    }
}
