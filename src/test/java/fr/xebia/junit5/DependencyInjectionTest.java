package fr.xebia.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

public class DependencyInjectionTest {

    @Test
    public void testInfo(TestInfo testInfo) {
        Assertions.assertTrue(testInfo.getDisplayName().contains("test"));
    }

    @Test
    public void testReporter(TestReporter testReporter) {
        testReporter.publishEntry("key","value");

        Map<String, String> m = new HashMap<>();
        m.put("username", "budpin");
        m.put("email", "bdupin@xebia.fr");

        testReporter.publishEntry(m);
    }
}
