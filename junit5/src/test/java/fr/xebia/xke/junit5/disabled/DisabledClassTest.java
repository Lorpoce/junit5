package fr.xebia.xke.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class DisabledClassTest {

  @Test
  void testWillBeSkipped() {
  }
}
