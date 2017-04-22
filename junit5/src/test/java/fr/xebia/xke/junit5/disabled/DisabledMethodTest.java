package fr.xebia.xke.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledMethodTest {

  @Test
  @Disabled
  void testWillBeSkipped() {
  }

  @Test
  void testWillBeExecuted() {
  }
}
