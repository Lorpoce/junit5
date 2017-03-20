package fr.xebia.xke.junit5;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJUnit5Tests {

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