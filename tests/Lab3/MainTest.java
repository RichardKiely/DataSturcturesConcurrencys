package Lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isBalanced() {
        String str = "a+{b+c+[d+e+(f+g)}";
        assertFalse(Main.isBalanced(str));

        String str1 = "a+{b+c+[d+e]+(f+g)}";
        assertTrue(Main.isBalanced(str1));

        String str2 = "(2+[5+7]+1)";
        assertTrue(Main.isBalanced(str2));

        String str3 = "1+2+3+4+5";
        assertTrue(Main.isBalanced(str3));

        String str4 ="( a + b * ( c / ( d – e ) ) ) + ( d / e )";
        assertTrue(Main.isBalanced(str4));

    }
}