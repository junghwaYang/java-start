package oop.Q;

public class Account {
//    잔액
    int balance;

//    입금
    void deposit(int amount){
        System.out.println(amount + "원을 입금 합니다");
        balance += amount;
        System.out.println(amount + "원 입금 완료");
    }
//    출금
    void withdraw(int amount){
        System.out.println(amount + "원을 출금 합니다");
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금 완료");
        }
        else {
            System.out.println("잔액 부족\n잔고:" + balance);
        }

    }
}
