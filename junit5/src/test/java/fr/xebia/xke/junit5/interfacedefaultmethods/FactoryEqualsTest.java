package fr.xebia.xke.junit5.interfacedefaultmethods;

import fr.xebia.xke.junit5.factory.Factory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public interface FactoryEqualsTest<T> extends Factory<T> {

  T createNotEqualValue();

  @Test
  default void valueEqualsItself() {
    T value = createValue();
    assertEquals(value, value);
  }

  @Test
  default void valueDoesNotEqualNull() {
    T value = createValue();
    assertFalse(value.equals(null));
  }

  @Test
  default void valueDoesNotEqualDifferentValue() {
    T value = createValue();
    T differentValue = createNotEqualValue();
    assertNotEquals(value, differentValue);
    assertNotEquals(differentValue, value);
  }

}
