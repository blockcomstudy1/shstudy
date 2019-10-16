package jst;
/*
상속
 */
class SuperCLS {
    protected static int count = 0;     //protected는 하위 클래스 접근 허용

    public SuperCLS() {
        count ++;
    }
}
class SubCLS extends SuperCLS{
    public void showCount() {
        // 상위 클래스에 위치한 클래스 변수 count에 접근
        System.out.println(count);
    }
}
class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS obj1 = new SuperCLS();
        SuperCLS obj2 = new SuperCLS();

        // 아래 인스턴스 생성 과정에서 SuperCLS 생성자가 호출되므로,
        SubCLS obj3 = new SubCLS(); // count 값 1 증가
        obj3.showCount();
    }
}