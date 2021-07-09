package com.sapient.controller.rest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.given;

@SpringBootTest
public class CartControllerTest {

    @Test
    public void shouldReturnHttpStatusCreated(){
        given()
                .log().all()
                .when()
                .get("http://localhost:8082/cart")
                .then()
                .statusCode(201)
                .log().all();
    }


}
