package oop.Q;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

//        계좌 입금
        account.deposit(10000);

//        계좌 출금
        account.withdraw(9000);

//        계좌 출금
        account.withdraw(2000);
    }
}
