public class Findxtothepowern {
    public static void main(String [] args){
        int x = 2;
        int n = 5;
        Solution sol = new Solution();
        System.out.println(sol.pow(x, n));
    }
}
class Solution {
    public int pow(int x, int n ){
        if(n == 0){
            return 1;
        }
        // int xpowern1 = pow(x, n - 1);
        // int xpowern = x * xpowern1;
        // return xpowern;
        return x * pow(x , n - 1);
    }
}
