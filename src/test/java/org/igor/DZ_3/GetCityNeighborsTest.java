package org.igor.DZ_3;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetCityNeighborsTest extends AccuweatherAbstractTest {
    @Test
    void getCityNeighborsSamara() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("locationKey", 290396)
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/neighbors/{locationKey}")
                .then()
                .statusCode(200);
    }

    @Test
    void getCityNeighborsMoscow() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("locationKey", 294021)
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/neighbors/{locationKey}")
                .then()
                .statusCode(200);
    }

    @Test
    void getCityNeighborsSaintPetersburg() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("locationKey", 295212)
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/neighbors/{locationKey}")
                .then()
                .statusCode(200);
    }

    @Test
    void getCityNeighborsKazan() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("locationKey", 295954)
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/neighbors/{locationKey}")
                .then()
                .statusCode(200);
    }

}
