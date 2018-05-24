package backendhelpers

//import io.qameta.allure.Step
//import io.qameta.allure.restassured.AllureRestAssured
import io.restassured.RestAssured.given
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

class NetworkManager {

    fun executeGet(url: String): Response {
        return given()
                .`when`()
                //.filter(AllureRestAssured())
                .urlEncodingEnabled(false)
                .get(url)
                .then()
                .extract()
                .response()

    }
    //Выполнение POST запроса
    fun <T> extractPost(spec: RequestSpecification, responseClass: Class<T>, requestBody: Any): T {
        return given()
                .spec(spec)
                .body(requestBody)
                .post()
                .then()
                .extract().`as`(responseClass)
    }

    fun executeDelete(hand: String): Response? {
        return given()
                .`when`()
                .urlEncodingEnabled(false)
                .delete(hand)
                .then()
                .extract()
                .response()
    }
    fun <T> extractPut(spec: RequestSpecification, responseClass: Class<T>, requestBody: Any): T {
        return given()
                .spec(spec)
                .body(requestBody)
                .put()
                .then()
                .extract().`as`(responseClass)
    }


}