package fr.xebia.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagsTest {

    @Test
    @Tag("slow")
    public void testSlow() {
        // ...
    }

    @Test
    @Tag("fast")
    public void testFast() {
        // ...
    }

}
