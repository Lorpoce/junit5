package fr.xebia.xke.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledDemoTests {

  @Disabled
  @Test
  void testWillBeSkipped() {
  }

  @Test
  void testWillBeExecuted() {
  }
}
