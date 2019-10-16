package jst;

class FormatString {
    public static void main(String[] args) {
        int age = 20;
        double height = 178.2;
        String name = "KIM SANG HYUK";

        System.out.printf(" name: %s \n", name);
        System.out.printf(" age: %d \n, height: %e \n\n", age, height);
        System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
        System.out.printf(" %g \n", 0.000014);
        System.out.printf(" %g \n", 0.0000014);
        /*
        %d 10진수
        %o 8진수
        %x 16
        %f 실수
        %e e표기법
        %g 출력의 대상에 따른 %e or %f
        %s 문자열
        %c 문자
         */
    }
}
