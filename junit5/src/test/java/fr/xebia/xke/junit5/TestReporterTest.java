package fr.xebia.xke.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;

class TestReporterTest {

  @Test
  void reportSingleValue(TestReporter testReporter) {
    testReporter.publishEntry("a key", "a value");
  }

  @Test
  void reportSeveralValues(TestReporter testReporter) {
    HashMap<String, String> values = new HashMap<>();
    values.put("user name", "dk38");
    values.put("award year", "1974");

    testReporter.publishEntry(values);
  }

}
