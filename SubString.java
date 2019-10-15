/*
문자열 뽑아내기
 */
package jst;

class SubString {
    public static void main(String[] args) {
        String st1 = "abcdefg";
        String st2 = st1.substring(2); //인덱스 2이후에 문자열 반환
        System.out.println(st2);

        String st3 = st1.substring(2, 4);//인덱스 2~3의 문자열 반환
        System.out.println(st3);
    }
}
