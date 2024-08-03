package org.igor;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("Тестирование проекта accuweather.com ")
@Feature("Тестирование API Location API")
public class GetCityNeighborsTest extends AccuweatherAbstractTest {
    @Test
    @DisplayName("Тест getCityNeighborsSamara - поиск соседних населенных пунктов рядом с городом Самара")
    @Description("Данный тест предназначен для поиска населенных пунктов рядом с городом Самара по locationKey")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.NORMAL)
    @Story("Получение объекта CityNeighbors для Samara")
    @Owner("Васильев Игорь")
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
    @DisplayName("Тест getCityNeighborsMoscow - поиск соседних населенных пунктов рядом с городом Москва")
    @Description("Данный тест предназначен для поиска населенных пунктов рядом с городом Москва по locationKey")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.NORMAL)
    @Story("Получение объекта CityNeighbors для Moscow")
    @Owner("Васильев Игорь")
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
    @DisplayName("Тест getCityNeighborsSaintPetersburg - поиск соседних населенных пунктов рядом с городом Санкт-Петербург")
    @Description("Данный тест предназначен для поиска населенных пунктов рядом с городом Санкт-Петербург по locationKey")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.NORMAL)
    @Story("Получение объекта CityNeighbors для SaintPetersburg")
    @Owner("Васильев Игорь")
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
    @DisplayName("Тест getCityNeighborsKazan - поиск соседних населенных пунктов рядом с городом Казань")
    @Description("Данный тест предназначен для поиска населенных пунктов рядом с городом Казань по locationKey")
    @Link("https://developer.accuweather.com/accuweather-locations-api/apis")
    @Severity(SeverityLevel.NORMAL)
    @Story("Получение объекта CityNeighbors для Kazan")
    @Owner("Васильев Игорь")
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
