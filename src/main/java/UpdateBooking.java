import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateBooking {
    @Test
    public void GetResponse() {
        String endpoint = "https://restful-booker.herokuapp.com/booking/4007";
        String body = """
                {
                    "firstname" : "Kev",
                    "lastname" : "Browns",
                    "totalprice" : 111,
                    "depositpaid" : true,
                    "bookingdates" : {
                    "checkin" : "2018-01-02",
                    "checkout" : "2019-01-03"
                    },
                    "additionalneeds" : "Supper"
                }
                """;
        var response=
                given().body(body).when().put(endpoint).then().
                        assertThat().
                        statusCode(200);
        response.log().body();
    }

}
