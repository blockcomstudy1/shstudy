import java.util.Scanner;

//public class Solution5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i <= n; i++){
//            System.out.println(i);
//        }
//    }
//}
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=n; i > 0; --i){
            System.out.println(i);
        }
    }
}