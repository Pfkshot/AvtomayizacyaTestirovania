package org.igor.DZ_3;

import org.igor.DZ_3.Weather.Weather;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FiveDaysTest extends  AccuweatherAbstractTest {

    @Test
    void test5DaysSamara(){
        Weather weather = given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/5day/290396")
                .then()
                .statusCode(200)
                .extract()
                .body().as(Weather.class);

        Assertions.assertEquals(5,weather.getDailyForecasts().size());
    }

    @Test
    void test5DaysMoscow(){
        Weather weather = given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/5day/294021")
                .then()
                .statusCode(200)
                .extract()
                .body().as(Weather.class);

        Assertions.assertEquals(5,weather.getDailyForecasts().size());
    }

    @Test
    void test5DaysSaintPetersburg(){
        Weather weather = given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/5day/295212")
                .then()
                .statusCode(200)
                .extract()
                .body().as(Weather.class);

        Assertions.assertEquals(5,weather.getDailyForecasts().size());
    }

    @Test
    void test5DaysKazan(){
        Weather weather = given().queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/5day/295954")
                .then()
                .statusCode(200)
                .extract()
                .body().as(Weather.class);

        Assertions.assertEquals(5,weather.getDailyForecasts().size());
    }
}
