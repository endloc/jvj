package org.example;
import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    @Test
    public void checkMaxCase1() {
        int testCase1Array[] = new int[]{0, 1, 2, 3, 4, 5};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertEquals(10, testCase1[5]);
    }

    @Test
    public void checkMaxCase2() {
        int testCase1Array[] = new int[]{5, 1, 2, 3, 4, 0};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertEquals(5, testCase1[5]);
    }

    @Test
    public void checkMaxCase3() {
        int testCase1Array[] = new int[]{3, 1, 2, 5, 4, 0};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertEquals(5, testCase1[5]);
    }

    @Test
    public void checkMinCase1() {
        int testCase1Array[] = new int[]{0, 1, 2, 3, 4, 5};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertEquals(0, testCase1[0]);
    }

    @Test
    public void checkMinCase2() {
        int testCase1Array[] = new int[]{5, 1, 2, 3, 4, 0};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertEquals(0, testCase1[0]);
    }

    @Test
    public void checkMinCase3() {
        int testCase1Array[] = new int[]{3, 1, 2, 5, 4, 0};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertEquals(0, testCase1[0]);
    }

    @Test
    public void fullMatchCase1() {
        int testCase1Array[] = new int[]{3, 1, 2, 5, 4, 0};
        int expected[] = new int[]{0, 1, 10, 3, 4, 5};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertArrayEquals(expected, testCase1);
    }

    @Test
    public void fullMatchCase2() {
        int testCase1Array[] = new int[]{0, -100, 33, 100, 12, 10};
        int expected[] = new int[]{-100, 0, 10, 12, 33, 100};
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertArrayEquals(expected, testCase1);
    }

    @Test
    public void fullMatchCase3() {
        int testCase1Array[] = new int[]{0, 0, -100, -33, 12};
        int expected[] = new int[]{-100, -33, };
        int testCase1[] = Main.sortArray(testCase1Array);
        Assert.assertArrayEquals(expected, testCase1);
    }
}