package fr.xebia.xke.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
@Tag("acceptance")
@Tag("model")
class TaggingDemoTests {

  @Test
  @Tag("taxes")
  void testingTaxCalculation() {
  }

}
