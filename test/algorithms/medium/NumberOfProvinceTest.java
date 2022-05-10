package algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfProvinceTest {

    @Test
    public void should_return_two() {
        // arrange
        int[][] isConnected = {{1,1,0}, {1,1,0}, {0,0,1}};
        int expected = 2;

        // act
        int actual = new NumberOfProvince().findCircleNum(isConnected);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_three() {
        // arrange
        int[][] isConnected = {{1,0,0}, {0,1,0}, {0,0,1}};
        int expected = 3;

        // act
        int actual = new NumberOfProvince().findCircleNum(isConnected);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_one() {
        // arrange
        int[][] isConnected = {{1}};
        int expected = 1;

        // act
        int actual = new NumberOfProvince().findCircleNum(isConnected);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fifteen_elements_should_return_three() {
        // arrange
        int[][] isConnected = {
                {  1,1,0,0,0,0,0,1,0,0,0,0,0,0,0}, // 0
                {1,  1,0,0,0,0,0,0,0,0,0,0,0,0,0}, // 1
                {0,0,  1,0,0,0,0,0,0,0,0,0,0,0,0}, // 2
                {0,0,0,  1,0,1,1,0,0,0,0,0,0,0,0}, // 3
                {0,0,0,0,  1,0,0,0,0,1,1,0,0,0,0}, // 4
                {0,0,0,1,0,  1,0,0,0,0,1,0,0,0,0}, // 5
                {0,0,0,1,0,0,  1,0,1,0,0,0,0,1,0}, // 6
                {1,0,0,0,0,0,0,  1,1,0,0,0,0,0,0}, // 7
                {0,0,0,0,0,0,1,1,  1,0,0,0,0,1,0}, // 8
                {0,0,0,0,1,0,0,0,0,  1,0,1,0,0,1}, // 9
                {0,0,0,0,1,1,0,0,0,0,  1,1,0,0,0}, // 10
                {0,0,0,0,0,0,0,0,0,1,1,  1,0,0,0}, // 11
                {0,0,0,0,0,0,0,0,0,0,0,0,  1,0,0}, // 12
                {0,0,0,0,0,0,1,0,1,0,0,0,0,  1,0}, // 13
                {0,0,0,0,0,0,0,0,0,1,0,0,0,0,  1}  // 14
        };
        int expected = 3;
        // 0,1,7,3,5,6,4,9,10,8,13,11,14
        // 2
        // 12

        // act
        int actual = new NumberOfProvince().findCircleNum(isConnected);

        // assert
        Assert.assertEquals(expected, actual);
    }

}
