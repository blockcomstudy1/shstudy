/*
문자열의 결합 및 삭제, 교체, 변환
 */
package jst;

class BuildString {
    public static void main(String[] args) {
        StringBuilder stbuf = new StringBuilder("123");

        stbuf.append(45678);//문자열 덧붙이기
        System.out.println(stbuf.toString());

        stbuf.delete(0, 2);//문자열 삭제
        System.out.println(stbuf.toString());

        stbuf.replace(0, 3, "AB");//문자열 교체
        System.out.println(stbuf.toString());

        stbuf.reverse(); // 문자열 뒤집기
        System.out.println(stbuf.toString());

        String sub = stbuf.substring(2, 4);//일부 문자열 변환
        System.out.println(sub);

    }
}
