package org.igor.DZ_3;

import org.igor.DZ_3.Location.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetLocationTest extends AccuweatherAbstractTest {
    @Test
    void getLocationSamara(){
        List<Location> result = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q","Samara")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Location.class);

        Assertions.assertEquals(10,result.size());
    }

    void getLocationMoscow(){
        List<Location> result = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q","Moscow")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Location.class);

        Assertions.assertEquals(10,result.size());
    }

    void getLocationSaintPetersburg(){
        List<Location> result = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q","Saint Petersburg")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Location.class);

        Assertions.assertEquals(10,result.size());
    }

}
