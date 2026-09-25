// public class RecursionBasics {

//     public static  void printdec(int n){
//         if(n == 1){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printdec(n - 1);

//     }
//     // decreacing order in the value of 10
//     public static void main(String [] args){
//         int n = 10;
//         printdec(n);

//     }
// }
//print number 1 to n
public class RecursionBasics {

    public static  void printdec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printdec(n - 1);
        System.out.println(n + " ");
        

    }
    // inorder in the value of 10
    public static void main(String [] args){
        int n = 10;
        printdec(n);

    }
}

