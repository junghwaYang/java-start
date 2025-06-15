package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //    public 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않는 금액 입니다.");
        }
    }

    //public 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족 합니다.");
        }
    }

    // public 잔액
    public int getBalance() {
        return balance;
    }


    // private 검증 로직: 내부에서만 사용해야함
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}

