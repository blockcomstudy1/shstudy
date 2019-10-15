package jst;

public class FirstStringIntro {
    public static void main(String[] args) {
        //문자열 반환과 동시에 참조변수로 참조
        String str1 = "Happy";
        String str2 = "BirthDay";
        System.out.println(str1 + " " + str2);
        //메소드에 문자열을 전달하는 방법
        printString(str1);
        printString(" ");
        printString(str2);
        printString("\n");
        printString("End of program ! \n");
    }

    //String 참조변수를 매개변수로 선언하여 문자열을 전달 받을 수 있다.
    public static void printString(String str) {
        System.out.print(str);
    }
}
