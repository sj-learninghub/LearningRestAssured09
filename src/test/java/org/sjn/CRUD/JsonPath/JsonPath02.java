package org.sjn.CRUD.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonPath02 {
    //  POST - Create -> Verify the Response
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    @Test
    public void test_post() {




        String payload_POST = "{\n" +
                "    \"firstname\" : \"Sushmita\",\n" +
                "    \"lastname\" : \"jawal\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"BookingDates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload_POST);

        Response response = requestSpecification.when().post();


        System.out.println(response.asString());
     JsonPath jsonPath=new JsonPath(response.asString());
     String bookingid=jsonPath.getString("bookingid");
     String firstname=jsonPath.getString("booking.firstname");
        String checkout=jsonPath.getString(" booking.BookingDates.checkout");
        System.out.println(bookingid);
        System.out.println(firstname);
        System.out.println(checkout);
      assertThat(bookingid).isNotNull().isNotEmpty().isNotBlank();
        assertThat(firstname).isNotNull().isNotBlank().isEqualTo("Sushmita");
        assertThat(checkout).isNotNull().isNotBlank();

        Assert.assertEquals(firstname,"s");






    }





}
