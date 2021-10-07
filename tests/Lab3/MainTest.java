package Lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isBalanced() {
        String str = "a+{b+c+[d+e+(f+g)}";
        assertTrue(Main.isBalanced(str));
    }
}