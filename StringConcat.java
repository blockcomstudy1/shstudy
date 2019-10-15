/*
문자열 연결 시키기
 */
package jst;

class StringConcat {
    public static void main(String[] args) {
        String st1 = "Coffe";
        String st2 = "Bread";

        String st3 = st1.concat(st2);
        System.out.println(st3);

        String st4 = "Fresh".concat(st3);
        System.out.println(st4);
    }
}
