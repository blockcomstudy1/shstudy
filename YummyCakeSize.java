package jst;
class Cake2 {
    public int size; //cake size
    public Cake2(int sz) {
        size = sz;
    }
    public void showCakeSize() {
        System.out.println("Bread Ounces: " + size);
    }
}

class CheeseCake2 extends Cake2 {
    public int size;

    public CheeseCake2(int sz1, int sz2) {
        super(sz1);
        size = sz2;
    }
    public void showCakeSize() {
        // super.size 는 상위 클래스의 size를 의미함
        System.out.println("Bread Ounces: " + super.size);
        // size는 이 클래스 CheeseCake 클래스의 size를 의미함
        System.out.println("Cheese Ounces: " + size);
    }
}

class YummyCakeSize {
    public static void main(String[] args) {
        CheeseCake2 ca1 = new CheeseCake2(5, 7);
        Cake2 ca2 = ca1;

        // ca2는 Cake형 이므로 ca2.size는 Ckae의 멤버 size를 의미함
        System.out.println("Bread Ounces: " + ca2.size);

        // ca1은 CheeseCake형 이므로 ca1.size는 CheeseCkae의 멤버 size를 의미함
        System.out.println("Cheese Ounces: " + ca1.size);
        System.out.println();

        ca1.showCakeSize();
        System.out.println();
        ca2.showCakeSize();


    }
}
