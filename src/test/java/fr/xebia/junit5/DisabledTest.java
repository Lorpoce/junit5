package fr.xebia.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Disabled("Test désactivé...")
public class DisabledTest {

    @Test
    @DisplayName("😱")
    public void test() {
        Assertions.assertEquals(2 + 3, 5);
    }
}
