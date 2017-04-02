package fr.xebia.xke.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledMethodTest {

  @Disabled
  @Test
  void testWillBeSkipped() {
  }

  @Test
  void testWillBeExecuted() {
  }
}
