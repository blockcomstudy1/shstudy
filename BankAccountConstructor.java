package jst;

class BankAccount1 {
    String accNumber;
    String ssNumber;
    int balance;

    public BankAccount1(String acc, String ss, int bal) { // 생성자
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔 액: " + balance + '\n');
        return balance;
    }
}

class BankAccountConstructor {
    public static void main(String[] args) {
        BankAccount1 yoon = new BankAccount1("12-34-56", "1244443-0000030", 10000);
        BankAccount1 park = new BankAccount1("33-55-66", "1112334-3392920", 10000);
        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
