// public class FirstOccurence {
//     public static  void main(String[] args){
//         int [] arr = {1,2,3,5,4,5,6,7,8};
//         int key = 5;
//         Solution sol = new Solution();
//         System.out.println(sol.firstoccurence(arr, key, 0));
//     }
// }
// first occurence 
// class Solution {
//     public int firstoccurence(int [] arr, int key , int i){
//         // base case 
//         if(i == arr.length){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }else{
//             return firstoccurence(arr, key, i + 1);
//         }
//     }
// }

public class FirstOccurence {
    public static  void main(String[] args){
        // int [] arr = {1,2,3,5,4,5,6,7,8};
        int [] arr = {5,5,5,5,5};
        int key = 5;
        Solution sol = new Solution();
        System.out.println(sol.lastoccurence(arr, key, 0));
    }
}
// last occurence
class Solution {
    public int lastoccurence(int [] arr, int key , int i){
        // base case 
        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccurence(arr, key, i + 1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
}
