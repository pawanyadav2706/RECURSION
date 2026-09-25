public class Faboncaseries {
    public static int fab(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        int fabnm1 = fab(n - 1);
        int favnm2 = fab(n - 2);
        int fabn = fabnm1 + favnm2;
        return fabn;
    }
    public static void main(String [] args){
        int n = 5;
        System.out.println(fab(n));
    }
}

