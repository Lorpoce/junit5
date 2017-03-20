package fr.xebia.xke.junit5.extension;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(IgnoreIOExceptionExtension.class)
public class IgnoreIOExceptionExtensionTest {

  @Test
  void ignoreIoException() throws IOException {
    throw new IOException("a message");
  }

  @Test
  void throwRuntimeException() {
    throw new RuntimeException("a message");
  }
}
