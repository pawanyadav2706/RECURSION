public class TilingProblem {
    public static void main(String [] args){
        int n = 4;
        Solution sol = new Solution();
        System.out.println(sol.tilingproblem(n));
    }
}
class Solution {
    public static int tilingproblem(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // work
        // chose vertical or horizontal
        // vertical
        // int vertical = tilingproblem(n - 1);

        // // horizontal
        // int horizontal = tilingproblem(n - 2);

        // int totalways = vertical + horizontal;

        return tilingproblem(n - 1) + tilingproblem(n - 2);

    }
}
