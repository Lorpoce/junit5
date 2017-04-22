package fr.xebia.xke.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ParameterizedTestDemo {
    private static final Logger LOG = LoggerFactory.getLogger(ParameterizedTestDemo.class);

    static Stream<String> stringProvider() {
        return Stream.of("foo", "bar");
    }

    static Stream<Arguments> stringAndIntProvider() {
        return Stream.of(ObjectArrayArguments.create("foo", 1), ObjectArrayArguments.create("bar", 2));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void testWithStringParameter(String argument) {
        LOG.info("Running testWithStringParameter. argument = {}", argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testWithValueSource(int argument) {
        assertNotNull(argument);
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void testWithEnumSource(TimeUnit timeUnit) {
        LOG.info("Running testWithEnumSource, timeUnit = {}", timeUnit);
        assertNotNull(timeUnit.name());
    }

    @ParameterizedTest
    @MethodSource(names = "stringProvider")
    void testWithSimpleMethodSource(String argument) {
        assertNotNull(argument);
    }

    @ParameterizedTest
    @MethodSource(names = "stringAndIntProvider")
    void testWithMultiArgMethodSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }

    @ParameterizedTest
    @CsvSource({"foo, 1", "bar, 2", "'baz, qux', 3"})
    void testWithCsvSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/two-column.csv")
    void testWithCsvFileSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }
}
