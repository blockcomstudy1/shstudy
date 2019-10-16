package jst;
class Cake3 {
}
class CheeseCake3 extends Cake {
}
class StrawBerryCheeseCake extends CheeseCake3{
}

class YummyCakeOf {
    public static void main(String[] args) {
        Cake cake = new StrawBerryCheeseCake();

        if (cake instanceof Cake) {
            System.out.println("케익 인스턴스 or");
            System.out.println("케익 상속하는 인스턴스 \n");
        }
        if (cake instanceof CheeseCake3) {
            System.out.println("치즈케익 인스턴스 or");
            System.out.println("치즈케익 상속하는 인스턴스 \n");
        }
        if (cake instanceof StrawBerryCheeseCake) {
            System.out.println("스트로베리케익 인스턴스 or");
            System.out.println("스트로베리케익 상속하는 인스턴스 \n");
        }
    }
}
