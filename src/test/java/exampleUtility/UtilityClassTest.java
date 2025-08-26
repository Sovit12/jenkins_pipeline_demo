package exampleUtility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import AutomationPractice.UtilityClass;

public class UtilityClassTest {

	@Test
    void testAdd() {
        int result = UtilityClass.add(3433, 33);
        assertEquals(3466, result);
    }

    @Test
    void testSub() {
        int result = UtilityClass.sub(343, 33);
        assertEquals(310, result);
    }

    @Test
    void testMul() {
        int result = UtilityClass.mul(34, 33);
        assertEquals(1122, result);
    }

    @Test
    void testDiv() {
        int result = UtilityClass.div(333, 3);
        assertEquals(111, result);
    }
}
