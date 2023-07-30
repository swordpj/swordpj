package DataStructure;

public class BinarySearch {
    public static int binarySearchBasic(int[] arrays, int target) {
        int i = 0;
        int j = arrays.length - 1;
        while(i  <= j) {
            int middle = (i + j) >> 1; ///数量级很大时，（i+j）/2 小心会Integer溢出，最好还是选择进行无符号右移一位
            if(arrays[middle] == target) {
                return middle;
            }
            else if(arrays[middle] > target) {
                j = middle - 1;
            }
            else {
                i = middle + 1;
            }
        }

        return -1;
    }
}
