package jst;
class MobilePhone {
    protected String number;

    public MobilePhone(String num) {
        number = num;
    }
    public void answer() {
        System.out.println("Hi ~ from " + number);
    }
}

class SmartPhone extends MobilePhone {
    private String androidVer;

    public SmartPhone(String num, String ver) {
        super(num);
        androidVer = ver;
    }
    public void playApp() {
        System.out.println("App is running in " + androidVer);
    }
}

class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone ph1 = new SmartPhone("010-555-1234", "Nougat");
        MobilePhone ph2 = new SmartPhone("010-212-1234", "Nougat");

        ph1.answer();
        ph1.playApp();
        System.out.println();

        ph2.answer();
        //ph2.playApp(); //ph2는 MobilePhone 에는 SmartPhone에 대한 내용을 상속받지 못한다.
    }
}
