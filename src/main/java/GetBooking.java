import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBooking {
    @Test
    public void GetResponse() {
        String endpoint = "https://restful-booker.herokuapp.com/booking/5918";
        String body = """
            
                """;
        var response=
                given().body(body).when().get(endpoint).then().
                        assertThat().
                        statusCode(200);
        response.log().body();
    }

}
