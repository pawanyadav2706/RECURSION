// public class Factorial {
//     public static void main(String [] args){
//         int n = 5;
//         Solution sol = new Solution();
//         System.out.println(sol.fact(n));
//     }
// }
// class Solution {
//     public int fact(int n){
//         int fact = 1;
//         for(int i = 1; i<=n; i++){
//             fact = fact * i;
//         }
//         return fact;
//     }
// }
// solve this qustion recursion 
public class Factorial {

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }
    public static void main(String [] args){
        int n = 5;
        System.out.println(fact(n));

    }
}

