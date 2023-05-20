package com.works;

import com.works.props.User;
import org.junit.jupiter.api.*;

import java.util.Random;
import java.util.UUID;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder( MethodOrderer.OrderAnnotation.class )
public class LifeMethods {

    User user = null;

    Random rnd = null;
    @BeforeAll
    void beforeAll() {
        System.out.println("LifeMethods Call");
        rnd = new Random();
    }

    public LifeMethods() {  }

    @BeforeEach
    void beforeEach() {
        user = new User();
        user.setUid(UUID.randomUUID().toString());
        user.setNumber( rnd.nextInt(100) );
    }

    @Order(1)
    @Test
    @DisplayName("JWT Token Test")
    void actionTest() {
        System.out.println("actionTest Call");
    }

    @Order(2)
    @Test
    @DisplayName("Test -1 Name")
    void test_1() {
        System.out.println( user );
        System.out.println("test_1 call - " + rnd.hashCode());
        Assertions.assertTrue(false, "Error Message");
    }

    @Order(4)
    @Test
    void test_2() {
        System.out.println( user );
        System.out.println("test_2 call - " + rnd.hashCode());
    }

    @Order(3)
    @Test
    void test_3() {
        System.out.println( user );
        System.out.println("test_3 call - " + rnd.hashCode());
    }



    @AfterEach
    void afterEach() {
        user = null;
    }

    @AfterAll
    void afterAll() {
        System.out.println("all test finish");
        rnd = null;
    }

}
