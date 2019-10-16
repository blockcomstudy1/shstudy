package jst;

class Cake1 {
    public void yummy(){
        System.out.println("Yummy Cake");
            }
}

class CheeseCake1 extends Cake1 {
    @Override
    public void yummy() {
        super.yummy();
        System.out.println("Yummy Cheese Cake");
    }
    public void tasty() {
        super.yummy();
        System.out.println("Yummy Tasty Cake");
    }
}
class YummyCakeSuper {
    public static void main(String[] args) {
        CheeseCake1 cake = new CheeseCake1();
        cake.yummy();
        cake.tasty();
    }
}
