package method;

public class MethodEx3Ref {
    // 메소드를 통한 리팩토링은 반복되는 코드를 중점적으로 파악하여, 최대한의 효율을 찾는 것이 중요
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 5000);
        withdraw(balance, 5000);
    }
    
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 잔액은 " + balance + "원입니다.");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액은 " + balance + "원입니다.");
        } else {
            System.out.println(amount + "원을 출금하려 했지만 잔액이 부족합니다. 현재 잔액은 " + balance + "원입니다.");
        }
        return balance;
    }
}

