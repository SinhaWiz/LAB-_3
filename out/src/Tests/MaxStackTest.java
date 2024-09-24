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
}
