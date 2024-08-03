package org.igor;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.igor.Location.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

@Epic("Тестирование проекта accuweather.com ")
@Feature("Тестирование API Location API")
public class GetLocationTest extends AccuweatherAbstractTest {
    @Test
    @DisplayName("Тест getLocationSamara - поиск объекта Location - город Самара")
    @Description("Данный тест предназначен для поиска Location по ключу Samara")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Получение объекта Location для Samara")
    @Owner("Васильев Игорь")
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
    @Test
    @DisplayName("Тест getLocationMoscow - поиск объекта Location - город Москва")
    @Description("Данный тест предназначен для поиска Location по ключу Moscow")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Получение объекта Location для Moscow")
    @Owner("Васильев Игорь")
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
    @Test
    @DisplayName("Тест getLocationSaintPetersburg - поиск объекта Location - город Санкт-Петербург")
    @Description("Данный тест предназначен для поиска Location по ключу Saint Petersburg")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Получение объекта Location для SaintPetersburg")
    @Owner("Васильев Игорь")
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
    @Test
    @DisplayName("Тест getLocationKazan - поиск объекта Location - город Казань")
    @Description("Данный тест предназначен для поиска Location по ключу Kazan")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Получение объекта Location для Kazan")
    @Owner("Васильев Игорь")
    void getLocationKazan(){
        List<Location> result = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q","Kazan")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Location.class);

        Assertions.assertEquals(10,result.size());
    }

}
