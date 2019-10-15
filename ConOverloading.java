/* 생성자 오버로딩
 */
package jst;
class Person {
    private int regiNum;
    private int passNum;

    Person(int rnum, int pnum) { //여권이 있는 사람을 위한 생성자
        regiNum = rnum;
        passNum = pnum;
    }
    Person(int rnum) { // 여권이 없는 사람을 위한 생성자
        regiNum = rnum;
        passNum = 0;
    }
    void showPersonalInfo() {
        System.out.println("주민등록 번호: " + regiNum);

        if(passNum != 0)
        System.out.println("여권 번호: " + passNum + '\n');
        else
            System.out.println("여권을 가지고 있지 않습니다. \n");
    }
}
class ConOverloading {
    public static void main(String[] args) {
        Person jung = new Person(335577, 112233);
        Person hong = new Person(665544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();
    }
}
