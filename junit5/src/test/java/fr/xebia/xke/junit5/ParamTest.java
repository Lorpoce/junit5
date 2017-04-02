package fr.xebia.xke.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

public class ParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void testWithStringParameter(String argument) {
        assertNotNull(argument);
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void testWithEnumSource(TimeUnit timeUnit) {
        assertNotNull(timeUnit.name());
    }
}
