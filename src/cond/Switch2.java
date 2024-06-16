package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 4;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }

        System.out.println("적용되는 쿠폰의 할인 금액 : " + coupon + "원");

        // switch문은 조건에 값을 확인할 변수를 넣고, case에 확인할 값을 넣는다.
        // 따라서 변수의 값이 case의 값과 일치하는 경우 코드를 실행한다.
        // case문에는 값을 넣기에 세미콜론(;)으로 끝내는 것이 콜론(:)을 넣어 값을 지정한다.
        // default문에도 break를 넣어주는 것이 좋다.
        // break는 해당 case가 실행될 때만 작용한다.
        // switch문은 단순한 if문이라고 보면 된다.
    }
}
