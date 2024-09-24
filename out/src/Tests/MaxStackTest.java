package Tests;

import Tasks.MaxStack;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxStackTest {
    @Test
    public void testPushAndMax() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.max());
    }

    @org.junit.jupiter.api.Test
    public void testPopAndMax() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.pop();
        assertEquals(5, stack.max());
    }
    @org.junit.jupiter.api.Test
    public void testMin() {
        MaxStack stack = new MaxStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        assertEquals(1, stack.min());
    }
    @org.junit.jupiter.api.Test
    public void testPushPopMinMax() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(10);
        stack.push(2);
        assertEquals(10, stack.max());
        assertEquals(2, stack.min());
        stack.pop();
        assertEquals(10, stack.max());
        assertEquals(3, stack.min());
    }
}
