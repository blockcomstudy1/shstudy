package jst;

import java.awt.print.Paper;

class Box2 {
    public void simpleWrap() {
        System.out.println("Simple Wrapping");
    }
}
class PaperBox extends Box2 {
    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public void goldWrap() {
        System.out.println("Gold Wrapping");
    }
}
class Wrapping {
    public static void main(String[] args) {
        Box2 box2 = new Box2();
        PaperBox box3 = new PaperBox();
        GoldPaperBox box4 = new GoldPaperBox();

        wrapBox(box2);
        wrapBox(box3);
        wrapBox(box4);
        }

        public static void wrapBox(Box2 box2) {
        if (box2 instanceof GoldPaperBox) {
            ((GoldPaperBox)box2).goldWrap();
        }
        else if (box2 instanceof PaperBox) {
            ((PaperBox)box2).paperWrap();
        }
        else {
            box2.simpleWrap();
        }
    }
}
