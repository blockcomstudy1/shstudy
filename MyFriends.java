package jst;
class UnivFriend {
    private String name;
    private String major;
    private String phone;

    public UnivFriend(String na, String ma, String ph){
        name = na;
        major = ma;
        phone = ph;
    }
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전공: " + major);
        System.out.println("전화: " + phone);
    }
}

class CompFriend {
    private String name;
    private String department;
    private String phone;

    public CompFriend(String na, String de, String ph){
        name = na;
        department = de;
        phone = ph;
    }
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("부서: " + department);
        System.out.println("전화: " + phone);
    }
}
class MyFriends {
    public static void main(String[] args) {
        //대학 동창의 관리를 위한 배열과 변수
        UnivFriend[] ufrns = new UnivFriend[5];
        int ucnt = 0;

        //직장 동료의 관리를 위한 배열과 변수
        CompFriend[] cfrns = new CompFriend[5];
        int ccnt = 0;

        //대학 동창의 정보 저장

        ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-332-1213");
        ufrns[ucnt++] = new UnivFriend("Seo", "Computer", "010-332-1212");

        //직장 동료의 정보 저장

        cfrns[ccnt++] = new CompFriend("YOON", "R&D 1", "010-234-5431");
        cfrns[ccnt++] = new CompFriend("KIM", "R&D 2", "010-244-5431");

        for(int i = 0; i < ucnt; i++) {
            ufrns[i].showInfo();
            System.out.println();
                    }
    }
}
