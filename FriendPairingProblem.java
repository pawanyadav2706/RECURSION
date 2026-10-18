public class FriendPairingProblem {
    public static void main(String [] args){
        int n = 3;
        Solution sol = new Solution();
        System.out.println(sol.friendspairing(n));
    }
}
class Solution {
    public static int friendspairing(int n){
        // base case
        if(n == 1 || n== 2){
            return n;
        }
        // work yani kaam
        // choise
        // single
        // int single = friendspairing(n - 1);
        // // pair
        // int pair = friendspairing(n - 2); 

        // int pairways = (n - 1) * pair;
        // // totalways
        // int totalpairways = single + pairways;
        // return totalpairways;
        return friendspairing(n - 1) + (n - 1) * friendspairing(n - 2);
    }
}
