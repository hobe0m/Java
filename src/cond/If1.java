package cond;

public class If1 {
    public static void main(String[] args) {
        // 조건문 : 조건문 : 특정 조건에 따라서 다른 코드를 실행하는 것
        // if문, switch문이 있다.
        // if문 ()안의 내용이 참일 경우에만 코드블럭 실행, 거짓이면 무시 후 다음으로 이동

        int age = 20; // 사용자의 나이

        if (age >= 18) {
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }

        age = 10;

        if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
    }

    // 만약 age가 15이면 "미성년자입니다."가 출력된다
    // else문은 if문의 ()내용이 참이 아닌 경우, 즉 만족하는 조건이 없을 때 실행하는 코드를 제공한다.
    // ()의 내용이 false거나 만족하지 않을 때 실행되는 코드이다.
}
