package Main.FindMaxConsecutiveOnesPack.Test;

import Main.FindMaxConsecutiveOnesPack.Main.FindMaxConsecutiveOnes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxConsecutiveOnesTest {
    private FindMaxConsecutiveOnes findMaxConsecutiveOnes;

    @BeforeEach
    void setUp() {
        findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
    }

    @Test
    public void testfindMaxConsecutiveOnes_true_1() {
        int[] arr = {1, 1, 0, 0, 1, 1, 1};
        int expectedResult = 3;
        int actualResult = findMaxConsecutiveOnes.FindMaxConsecutiveOnes(arr);
        assertEquals(expectedResult, actualResult, "Error testfindMaxConsecutiveOnes_true_1");
    }

    @Test
    public void testfindMaxConsecutiveOnes_true_2() {
        int[] arr = {1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1};
        int expectedResult = 4;
        int actualResult = findMaxConsecutiveOnes.FindMaxConsecutiveOnes(arr);
        assertEquals(expectedResult, actualResult, "Error testfindMaxConsecutiveOnes_true_2");
    }

    @Test
    public void testfindMaxConsecutiveOnes_false_1() {
        int[] arr = {1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1};
        int expectedResult = 3;
        int actualResult = findMaxConsecutiveOnes.FindMaxConsecutiveOnes(arr);
        assertEquals(expectedResult, actualResult, "Test testfindMaxConsecutiveOnes_false_1 must be FALSE");
    }
}
