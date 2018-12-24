package ArrayUtil.Test;

import Array.Util.IntegerArrayUtil;
import org.junit.Assert;
import org.junit.Test;

public class IntegerArrayUtilTest {
    IntegerArrayUtil integerArrayUtil = new IntegerArrayUtil();

    @Test
    public void getSumTest() {
        //Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 15;

        //When
        Integer actual = integerArrayUtil.getSum(input);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getAverageTest() {
        //Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Double expected = 3.0;

        //When
        Double actual = integerArrayUtil.getAverage(input);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getMaxTest() {
        //Given
        Integer[] input = { 1, 5, 3, 4, 2};
        Integer expected = 5;

        //When
        Integer actual = integerArrayUtil.getMax(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mergeTest(){
        //Given
        Integer[] array1 = {5, 1, 8};
        Integer[] array2 = {4, 2};
        Integer[] expected = {5, 1, 8, 4, 2};

        //When
        Integer[] actual = integerArrayUtil.merge(array1, array2);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void mostCommonTest(){
        //Given
        Integer commonValue = 8;
        Integer[] array = {2, 1, 1, commonValue, 5, 5, commonValue, commonValue};

        //When
        Integer actual = integerArrayUtil.mostCommon(array);

        //Then
        Assert.assertEquals(commonValue, actual);
    }



}
