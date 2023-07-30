package DataStructureTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static DataStructure.BinarySearch.binarySearchBasic;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BinarySearchTest {
    @Test
    @DisplayName("BinarySearch is Found")
    public void testFound() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchBasic(a, 7));
        assertEquals(3, binarySearchBasic(a, 30));
        assertEquals(7, binarySearchBasic(a, 53));
    }

    @Test
    @DisplayName("BinarySearch is Not Found")
    public void testNotFound() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(-1, binarySearchBasic(a, 6));
        assertEquals(-1, binarySearchBasic(a, 56));
        assertEquals(-1, binarySearchBasic(a, 51));
    }


}
