import java.util.*;
public class ArraySortedorNot {
    public static void main(String[] args){
        // int [] arr = {1,2,3,4};
        int [] arr = {1,2,4,3};
        Solution sol = new Solution();
        System.out.println(sol.isSorted(arr, 0));
    }
}
class Solution {
    public static boolean isSorted(int arr[], int i){
        // base case
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }
       return  isSorted(arr, i + 1);
    }
}
