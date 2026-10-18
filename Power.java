public class Power {
    public static void main(String [] args){ // time complexity 0(logn)
        int a = 2;
        int n = 5;
        Solution sol = new Solution();
        System.out.println(sol.optimizedpower(a, n));
    }
}
class Solution {
    public static int optimizedpower(int a, int n){
        // base case
        if(n == 0){
            return 1;
        }
        // work flow
        int halfpower = optimizedpower(a, n/2);
        int halfpowersq = halfpower * halfpower;
        // n is odd
        if(n % 2 != 0){
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }
}
