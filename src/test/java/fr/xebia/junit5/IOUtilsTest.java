package fr.xebia.junit5;

import org.apache.commons.io.IOUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class IOUtilsTest {

    private InputStream is;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting IOUtils tests");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("IOUtils tests finished");
    }

    @Before
    public void before() {
        is = IOUtilsTest.class.getResourceAsStream("/file.txt");
    }

    @Test
    public void testToString() throws IOException {
        // When
        String s = IOUtils.toString(is);

        // Then
        assertEquals("Should be equals to \"Hello world!\\n\"", "Hello world!\n", s);
    }

}
