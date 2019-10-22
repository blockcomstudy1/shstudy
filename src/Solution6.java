import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i=1; i<=c; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > 0 && b < 10) {
                System.out.print("Case #" + i + ": ");
                System.out.println(a+b);
            }

        }
    }
}
