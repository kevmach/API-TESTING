package MYPRACTICETESTS;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class API_TESTING {
    @Test
    public void getCategories(){
        String endpoint = "http://localhost:8888/api_testing/category/read.php";
        var response= given().when().get(endpoint).then();
    }
    @Test
    public void createSubscriber(){
        String endpoint = "http://192.168.92.69:8081/TxnWebapp/JsonSelector?LOGIN=Ussd_Bearer1&PASSWORD=MPtc1ToayCkCMZZeHUu0snA3aUaPbSFQ9UzIkNGbVRU=&REQUEST_GATEWAY_CODE=USSD&REQUEST_GATEWAY_TYPE=USSD&requestText= ";
        String body = """
                {
                
                "TYPE": "RSUBREG",
                "PROVIDER": "101",
                "PAYID": "12",
                "FNAME": "Test",
                "LNAME": "Tested",
                "MSISDN": "788194771",
                "PROVIDER2": "101",
                "PAYID2": "12",
                "MSISDN2": "774848360",
                "IDNUMBER": "75-57898D58",
                "MPIN": "4827",
                "PIN": "4827",
                "DOB": "07122000",
                "GENDER": "Male",
                "ADDRESS": "Harare",
                "DISTRICT": "Harare",
                "CITY": "Harare",
                "LOGINID": "Harare",
                "PASSWORD": "11",
                "CPASSWORD": "1357",
                "LANGUAGE1": "1",
                "REGTYPEID": "NO_KYC",
                "BLOCKSMS": "PAYER",
                "CELLID": "Cellid1234",
                "FTXNID": "FTxnId345",
                "IDTYPE": "PASSPORT",
                "ISIMTENABLE": "Y",
                "IMTIDTYPE": "PASSPORT",
                "IMTIDNO": "ASDFASDF12345",
                "IDISSUEPLACE": "dmm",
                "IDISSUECOUNTRY": "IN",
                "RCOUNTRY": "IN",
                "NATIONALITY": "IN",
                "IDISSUEDATE": "20081990",
                "ISIDEXPIRES": "Y",
                "IDEXPIRYDATE": "20082088",
                "POSTAL_CODE": "32344",
                "EMPLOYER_NAME": "cvxcvfv",
                "OCCUPATION": "xcxzcx",
                "WUENABLE": "Y",\s
                "MONEYGRAMENABLE": "Y",
                "BIRTHCITY": "Bang",
                "BIRTHCOUNTRY": "IN",
                "PASSPORTISSUECOUNTRY": "IN",
                "PASSPORTISSUECITY": "BANG",
                "PASSPORTISSUEDATE": "01041990"
                }
                """;

        var response= given().body(body).when().post(endpoint).then();
        response.log().body();
    }
}
