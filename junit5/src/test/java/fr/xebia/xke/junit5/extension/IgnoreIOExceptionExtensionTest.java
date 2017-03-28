package fr.xebia.xke.junit5.extension;

import fr.xebia.xke.junit5.extension.impl.IgnoreIOExceptionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

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
