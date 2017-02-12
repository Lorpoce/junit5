package fr.xebia.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

@DisplayName("\uD83D\uDE31")
public class FirstTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test...");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each test...");
    }

    @AfterAll
    public static void afterAll() {
        System.out.print("After all");
    }

    @Test
    public void test1() {
        assertTrue(true);
    }

    @Test
    public void test2() {
        assertTrue(true);
    }

}
