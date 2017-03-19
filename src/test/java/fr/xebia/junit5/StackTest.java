package fr.xebia.junit5;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;

public class StackTest {

    private Stack<String> stack;

    @Before
    public void before() {
        stack = new Stack<>();
    }

    @Test
    public void testEmpty() {
        // When
        boolean empty = stack.empty();

        // Then
        assertTrue("The stack should be empty", empty);
    }

    @Test(expected = EmptyStackException.class)
    public void testPop() {
        // When
        stack.pop();

        // Then
        // Expect an EmptyStackException
    }

    @Test(expected = EmptyStackException.class)
    public void testPeek() {
        // When
        stack.peek();

        // Then
        // Expect an EmptyStackException
    }

    @Test
    public void testPopAfterPush() {
        // Given
        String s = "xebia";

        // When
        stack.push(s);
        String popedString = stack.pop();
        boolean empty = stack.empty();

        // Then
        assertEquals(s, popedString);
        assertTrue(empty);
    }

    @Test
    public void testPeekAfterPush() {
        // Given
        String s = "xebia";

        // When
        stack.push(s);
        String peekedString = stack.peek();
        boolean empty = stack.empty();

        // Then
        assertEquals(s, peekedString);
        assertFalse(empty);
    }

}
