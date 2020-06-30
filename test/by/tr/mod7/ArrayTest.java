package by.tr.mod7;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void sumOfNegativeValuesT001() {
        int mas [][]= {{1,3,-2,6},{-10,-22,2,5},{4,3,2,7}};
        int[] realArr;
        int [] expectedArr = {-2,-32,0};
        realArr = Array.sumOfNegativeValues(mas);
        Assert.assertArrayEquals(expectedArr, realArr);
    }
    @Test
    public void maxElementInLineT001() {
        int mas [][]= {{1,3,-2,6},{-10,-22,2,5},{4,3,2,7}};
        int[] realArr;
        int [] expectedArr = {6,5,7};
        realArr = Array.maxElementInLine(mas);
        Assert.assertArrayEquals(expectedArr, realArr);
    }
    @Test
    public void changeMaxMinT001() {
        int mas [][]= {{1,3,-2,6},{-10,-22,2,5},{4,3,2,7}};
        int[][] realArr;
        int [][] expectedArr = {{1,3,-2,6},{-10,7,2,5},{4,3,2,-22}};
        realArr = Array.changeMaxMin(mas);
        Assert.assertArrayEquals(expectedArr, realArr);
    }

}
// Спасибо. Тесты зачтены.
