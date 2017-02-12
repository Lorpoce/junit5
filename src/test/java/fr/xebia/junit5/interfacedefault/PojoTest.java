package fr.xebia.junit5.interfacedefault;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface PojoTest<T> {

    T createPojo();

    T createAnOther();

    @Test
    default void testPojoEqualsItself() {

        T pojo = createPojo();

        Assertions.assertEquals(pojo, pojo);
    }

    @Test
    default void testPojoNotEqualsNull() {

        T pojo = createPojo();

        Assertions.assertFalse(pojo.equals(null));

    }

    @Test
    default void testPojoNotEqualsAnOther() {

        T pojo = createPojo();

        T other = createAnOther();

        Assertions.assertNotEquals(pojo, other);
    }
}
