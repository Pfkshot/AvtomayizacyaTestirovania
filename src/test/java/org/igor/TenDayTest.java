package org.igor;

import io.qameta.allure.*;
import io.restassured.http.Method;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Epic("Тестирование проекта accuweather.com ")
@Feature("Тестирование API Weather API")
public class TenDayTest extends AccuweatherAbstractTest{

    @Test
    @DisplayName("Тест getTenDaysSamara_shouldReturn401 (негативный) - запрос прогноза погоды на 10 дней в городе Самара")
    @Description("Негативный тест - проверка получения погоды за 10 дней")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.TRIVIAL)
    @Story("Вызов метода получения погоды за 10 дней для Самары")
    @Owner("Васильев Игорь")
      void getTenDaysSamara_shouldReturn401() {

        given()
                .queryParam("apikey", getApiKey())
                .pathParam("version", "v1")
                .pathParam("location", 290396)
                .when()
                .request(Method.GET,getBaseUrl()+"/forecasts/{version}/daily/10day/{location}")
                .then()
                .statusCode(401);
    }

    @Test
    @DisplayName("Тест getTenDaysMoscow_shouldReturn401 (негативный) - запрос прогноза погоды на 10 дней в городе Москва")
    @Description("Негативный тест - проверка получения погоды за 10 дней")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.TRIVIAL)
    @Story("Вызов метода получения погоды за 10 дней для Москвы")
    @Owner("Васильев Игорь")
    void getTenDaysMoscow_shouldReturn401() {

        given()
                .queryParam("apikey", getApiKey())
                .pathParam("version", "v1")
                .pathParam("location", 294021)
                .when()
                .request(Method.GET,getBaseUrl()+"/forecasts/{version}/daily/10day/{location}")
                .then()
                .statusCode(401);
    }

    @Test
    @DisplayName("Тест getTenDaysSaintPetersburg_shouldReturn401 (негативный) - запрос прогноза погоды на 10 дней в городе Санкт-Петербург")
    @Description("Негативный тест - проверка получения погоды за 10 дней")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.TRIVIAL)
    @Story("Вызов метода получения погоды за 10 дней для Санкт-Петербурга")
    @Owner("Васильев Игорь")
    void getTenDaysSaintPetersburg_shouldReturn401() {

        given()
                .queryParam("apikey", getApiKey())
                .pathParam("version", "v1")
                .pathParam("location", 295212)
                .when()
                .request(Method.GET,getBaseUrl()+"/forecasts/{version}/daily/10day/{location}")
                .then()
                .statusCode(401);
    }

    @Test
    @DisplayName("Тест getTenDaysKazan_shouldReturn401 (негативный) - запрос прогноза погоды на 5 дней в городе Казань")
    @Description("Негативный тест - проверка получения погоды за 10 дней")
    @Link("https://developer.accuweather.com/accuweather-forecast-api/apis")
    @Severity(SeverityLevel.TRIVIAL)
    @Story("Вызов метода получения погоды за 10 дней для Казани")
    @Owner("Васильев Игорь")
    void getTenDaysKazan_shouldReturn401() {

        given()
                .queryParam("apikey", getApiKey())
                .pathParam("version", "v1")
                .pathParam("location", 295954)
                .when()
                .request(Method.GET,getBaseUrl()+"/forecasts/{version}/daily/10day/{location}")
                .then()
                .statusCode(401);
    }
}