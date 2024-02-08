package Main.PlusOneValueArray.Test;

import Main.PlusOneValueArray.Main.PlusOneValueArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOneValueArrayTest {
    PlusOneValueArray  plusOneValueArray;

    @BeforeEach
    void setUp() {
        plusOneValueArray = new PlusOneValueArray();
    }

    @Test
    public void testPlusOneValueArray_true_1 () {
        int[] dataDigit = {1, 0, 0};
        int[] expectedDigit = {1, 0, 1};
        boolean expectedResult = true;
        int[] actualDigit = plusOneValueArray.plusOne(dataDigit);
        boolean actualResult = Arrays.equals(expectedDigit, actualDigit);
        assertEquals(expectedResult, actualResult, "testPlusOneValueArray_true_1");
    }

    @Test
    public void testPlusOneValueArray_true_2 () {
        int[] dataDigit = {9};
        int[] expectedDigit = {1, 0};
        boolean expectedResult = true;
        int[] actualDigit = plusOneValueArray.plusOne(dataDigit);
        boolean actualResult = Arrays.equals(expectedDigit, actualDigit);
        assertEquals(expectedResult, actualResult, "testPlusOneValueArray_true_2");
    }

    @Test
    public void testPlusOneValueArray_true_3 () {
        int[] dataDigit = {0};
        int[] expectedDigit = {1};
        boolean expectedResult = true;
        int[] actualDigit = plusOneValueArray.plusOne(dataDigit);
        boolean actualResult = Arrays.equals(expectedDigit, actualDigit);
        assertEquals(expectedResult, actualResult, "testPlusOneValueArray_true_3");
    }

    @Test
    public void testPlusOneValueArray_false_1 () {
        int[] dataDigit = {0};
        int[] expectedDigit = {0};
        boolean expectedResult = true;
        int[] actualDigit = plusOneValueArray.plusOne(dataDigit);
        boolean actualResult = Arrays.equals(expectedDigit, actualDigit);
        assertEquals(expectedResult, actualResult, "Test testPlusOneValueArray_false_1 must be FALSE");
    }
}
