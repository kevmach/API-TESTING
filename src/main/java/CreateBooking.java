import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static io.restassured.path.json.JsonPath.given;

public class CreateBooking {
    @Test
    public void GetResponse() {
        String endpoint = "https://restful-booker.herokuapp.com/booking";
        var response=
        given().
                header("Content-Type", "application/json; charset=utf-8").accept(ContentType.JSON).
                when().post(endpoint).
                then().log().body().
                assertThat().
                statusCode(200).
                body("firstname", equalTo("Kev")).
                body("lastname", equalTo("Brown")).
                body("totalprice", equalTo("111")).
                body("deposit", equalTo("trues")).
                body("bookingdates", notNullValue()).
                body("checkin", equalTo("2018-01-02")).
                body("checkout", equalTo("2019-01-01")).
                body("additionalneeds", equalTo("Breakfast"));
    }
}
