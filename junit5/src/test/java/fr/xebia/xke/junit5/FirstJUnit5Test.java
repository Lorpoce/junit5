package fr.xebia.xke.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

class FirstJUnit5Test {

  @BeforeAll
  static void initAll() {
  }

  @AfterAll
  static void tearDownAll() {
  }

  @BeforeEach
  void init() {
    System.out.print("before");
  }

  @Test
  void succeedingTest() {
  }

  @Test
  void failingTest() {
    fail("a failing test");
  }

  @Test
  @Disabled("for demonstration purposes")
  void skippedTest() {
    // not executed
  }

  @AfterEach
  void tearDown() {
  }

}
