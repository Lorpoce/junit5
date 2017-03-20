package fr.xebia.xke.junit5.extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimingExtension.class)
public class TimingExtensionTest {

  @Test
  void sleep20ms() throws Exception {
    Thread.sleep(20);
  }

  @Test
  void sleep50ms() throws Exception {
    Thread.sleep(50);
  }

}
