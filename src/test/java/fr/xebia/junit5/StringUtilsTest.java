package fr.xebia.junit5;

import fr.xebia.junit5.categories.UnitTests;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.UUID;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Category(UnitTests.class)
public class StringUtilsTest {

    @Test
    public void testIsNotBlank_emptyString() {
        // Given
        String s = "";

        // When
        boolean notBlank = StringUtils.isNotBlank(s);

        // Then
        assertFalse("s is blank", notBlank);
    }

    @Test
    public void testIsNotBlank_nullString() {
        // Given
        String s = null;

        // When
        boolean notBlank = StringUtils.isNotBlank(s);

        // Then
        assertFalse("s is null", notBlank);
    }

    @Test
    public void testIsNotBlank() {
        // Given
        String s = UUID.randomUUID().toString();

        // When
        boolean notBlank = StringUtils.isNotBlank(s);

        // Then
        assertTrue("s is neither blank nor null", notBlank);
    }

}
