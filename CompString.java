/*
문자열 비교
 */
package jst;

class CompString {
    public static void main(String[] args) {
        String st1 = "Lexicographically";
        String st2 = "lexicographically";
        int cmp;

        if(st1.equals(st2))// 두 문자열이 일치한다면
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");

        cmp = st1.compareTo(st2);//st1과 st2의 문자열 비교

        if(cmp==0)//일치할 경우
            System.out.println("두 문자열은 일치합니다.");
        else if (cmp < 0) //비교한 값이 크면
            System.out.println("사전의 앞에 위치하는 문자: " + st1);//true
        else System.out.println("사전의 앞에 위치하는 문자: " + st2);//false

        if(st1.compareToIgnoreCase(st2) == 0)//compareto와 일치한다.
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");
    }
}
