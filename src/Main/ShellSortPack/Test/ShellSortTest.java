package Main.ShellSortPack.Test;

import Main.ShellSortPack.Main.ShellSort;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShellSortTest {
    private ShellSort shellSort;

    @BeforeEach
    void setUp() {
        shellSort = new ShellSort();
    }

    @Test
    public void testShellSort_true() {
        boolean expectedResult = true;

        //data
        int[] arr = {12, 3, 4, 1};

        int[] arrExpected = {1, 3, 4, 12};

        int[] arrActual = shellSort.sort(arr);
        boolean actualResult = Arrays.equals(arrExpected, arrActual);
        assertEquals(expectedResult, actualResult, "Error testShellSort_true");
    }

    @Test
    public void testShellSort_false_1() {
        boolean expectedResult = false;

        //data
        int[] arr = {12, 3, 4, 1};

        int[] arrExpected = {4, 3, 1, 12};

        int[] arrActual = shellSort.sort(arr);
        boolean actualResult = Arrays.equals(arrExpected, arrActual);
        assertEquals(expectedResult, actualResult, "Error testShellSort_false_1");
    }

    @Test
    public void testShellSort_false_2() {
        boolean expectedResult = false;

        //data
        int[] arr = {12, 3, 4, 1};

        int[] arrExpected = {88, 11, 22, 55};

        int[] arrActual = shellSort.sort(arr);
        boolean actualResult = Arrays.equals(arrExpected, arrActual);
        assertEquals(expectedResult, actualResult, "Error testShellSort_false_2");
    }

    @Test
    public void testShellSort_false_3() {
        boolean expectedResult = false;

        //data
        int[] arr = {12, 3, 4, 1};

        int[] arrExpected = {888, 999, 111};

        int[] arrActual = shellSort.sort(arr);
        boolean actualResult = Arrays.equals(arrExpected, arrActual);
        assertEquals(expectedResult, actualResult, "Error testShellSort_false_3");
    }
}
