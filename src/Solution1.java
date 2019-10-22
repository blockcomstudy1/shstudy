import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0&&a<=9){
            for (int i = 0; i <= 9; i++){
                System.out.println(a + " * " + i + " = " + a*i);
            }
        }
    }
}