package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon;
        
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }

        System.out.println("발급받은 쿠폰 : " + grade + "등급 할인 쿠폰, " + "적용 되는 쿠폰 할인 " + coupon + "원"  );
    }

    // if문은 비교 연산자를 사용할 수 있지만 switch문은 단순히 값이 같은지만 비교할 수 있다.
    // 조건식의 결과 값이 어떤 case의 값과 일치하면 해당 case의 코드 실행
    // break문은 현재 실행중인 코드를 끝내고 switch문을 빠져나가게 하는 역할을 한다.
    // 만약 break문이 없으면 조건이 맞는 case문을 실행하더라도 이후의 case문의 모든 코드를 순차적으로 실행한다.
    // default는 조건식의 결과값이 모든 case의 값과 일치하지 않을 때 실행된다.
    //  - if문의 else와 같은 역할을 한다.

    // if = switch, else if = case, else = default

}
