package org.igor;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.igor.Weather.Weather;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("Тестирование проекта accuweather.com ")
@Feature("Тестирование API Weather API")
public class FiveDaysTest extends  AccuweatherAbstractTest {

    @Test
    @DisplayName("Тест test5DaysSamara - запрос прогноза погоды на 5 дней в городе Самара")
    @Description("Данный тест предназначен для получения данных о погоде за 5 дней в городе Самара")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Вызов метода получения погоды за 5 дней для Самары")
    @Owner("Васильев Игорь")
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
    @DisplayName("Тест test5DaysMoscow - запрос прогноза погоды на 5 дней в городе Москва")
    @Description("Данный тест предназначен для получения данных о погоде за 5 дней в городе Москва")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Вызов метода получения погоды за 5 дней для Москвы")
    @Owner("Васильев Игорь")
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
    @DisplayName("Тест test5DaysSaintPetersburg - запрос прогноза погоды на 5 дней в городе Санкт-Петербург")
    @Description("Данный тест предназначен для получения данных о погоде за 5 дней в городе Санкт-Петербург")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Вызов метода получения погоды за 5 дней для Санкт-Петербурга")
    @Owner("Васильев Игорь")
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
    @DisplayName("Тест test5DaysKazan - запрос прогноза погоды на 5 дней в городе Казань")
    @Description("Данный тест предназначен для получения данных о погоде за 5 дней в городе Казань")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Вызов метода получения погоды за 5 дней для Казани")
    @Owner("Васильев Игорь")
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
