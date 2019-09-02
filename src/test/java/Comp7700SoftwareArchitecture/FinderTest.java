package Comp7700SoftwareArchitecture;

import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findMax_Valid() {
        int[] arr = {1,5,-9,12,-3,80, 18,23,4,-6};
        int expected = 80;
        int actual = Finder.findMax(arr);
        assertEquals(expected,actual);
    }

    @Test
    public void findMax_Null() {
        int[] arr = {};
        assertNull(Finder.findMax(arr));
    }

    @Test
    public void findMax_Empty() {
        int[] arr = new int[0];
        assertNull(Finder.findMax(arr));
    }

    @Test
    public void findMin_Valid() {
        int[] arr = {1,5,-9,12,-3,80, 18,23,4,-6};
        int expected = -9;
        int actual = Finder.findMin(arr);
        assertEquals(expected,actual);
    }

    @Test
    public void findMin_Null() {
        int[] arr = {};
        assertNull(Finder.findMin(arr));
    }

    @Test
    public void findMin_Empty() {
        int[] arr = new int[0];
        assertNull(Finder.findMin(arr));
    }
}