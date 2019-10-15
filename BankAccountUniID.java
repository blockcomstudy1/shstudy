package jst;

class BankAccount {
    String accNumber;
    String ssNumber;
    int balance = 0;

    //초기화를 위한 메소드
    public void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;//계좌 개설 시 예금액으로 초기화
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔 액 : " + balance + '\n');
        return balance;
    }
}
    class BankAccountUniID {
    public static void main(String[] args) {
        BankAccount yoon = new BankAccount(); // 계좌생성
        yoon.initAccount("12-34-56", "9909990-999001", 10000); //초기화
        BankAccount park = new BankAccount();
        park.initAccount("34-56-78", "443432-194933-39", 20000);

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(1000);
        park.withdraw(3000);

        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
