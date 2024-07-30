package org.igor.DZ_3;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetCityNeighborsTest extends AccuweatherAbstractTest {
    @Test
    void getCityNeighbors() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("locationKey", 290396)
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/neighbors/{locationKey}")
                .then()
                .statusCode(200);
    }

}
