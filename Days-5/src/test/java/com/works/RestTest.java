package com.works;

import com.google.gson.Gson;
import com.works.props.Product;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.hamcrest.Matchers.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RestTest {

    private RequestSpecification specification;
    private Gson gson;

    @BeforeAll
    void beforeAll() {
        RestAssured.baseURI = "https://dummyjson.com/";
        specification = RestAssured.given();
        gson = new Gson();
        //specification.param("apiKey", "38a9e086f10b445faabb4461c4aa71f");
    }

    @Test
    void allProductTest() {
        specification
        .when()
        .get("products")
        .then()
        .body("total", equalTo(100))
        .body("products.title", hasItem("Elbow Macaroni - 400 gm"))
        .statusCode(HttpStatus.SC_OK);
    }

    @Test
    void saveProductTest() {
        Product p = new Product(0l, "TV", "TV Detay");
        Response response = specification
                .when()
                // .log().all()
                .body(p)
                .contentType(ContentType.JSON)
                .post("products/add")
                .then()
                .extract().response();
        long time = response.time();
        System.out.println( "Time : " + time );
        String stObj = response.body().print();
        Product pro = gson.fromJson(stObj, Product.class);
        System.out.println( pro.getId() + " - " + pro.getTitle());

        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals(101, response.jsonPath().getInt("id") );
        Assertions.assertTrue( time < 2000, "Timeout Service " );
    }


    @Test
    void xmlTest() {
        String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
        Response response = specification
                .log().all()
                .contentType(ContentType.XML)
                .get(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();
                //.body( hasXPath("/note/to", containsString("Tove")));
        try {
            String stData = response.xmlPath().getString("CurrencyName");
            System.out.println("stData : " + stData);
        }catch (Exception  ex) {
            System.err.println("xml error : " + ex);
        }

    }


}
