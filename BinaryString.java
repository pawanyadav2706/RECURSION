public class BinaryString {
    public static void main(String [] args){
        int n = 3;
        int lastplace = 0;
        Solution sol = new Solution();
        sol.printBinaryString("", n, lastplace);
    }
}
// no consecutive binary string 
class Solution {
    public static void printBinaryString(String str, int n, int lastplace){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // work
        // if(lastplace == 0){
        //     //sit 0 on chair n
        //     printBinaryString(str+"0", n - 1, 0);
        //     printBinaryString(str+"1", n - 1, 1);
        // }else{
        //     printBinaryString(str+"1", n - 1, 1);
        // }
        printBinaryString(str+"0", n - 1, 0);
        if(lastplace == 0){
            printBinaryString(str+"1", n - 1, 1);
        }
    }
}
