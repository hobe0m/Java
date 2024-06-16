package cond;

public class Switch3 {
    public static void main(String[] args) {
        
        // 2등급과 3등급 모두에게 3000원 할인쿠폰을 부여한다는 가정
        
        int grade = 1;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                // coupon = 3000; 두 개의 케이스가 하나의 코드를 사용할 경우 둘 중 하나는 생략해도 된다.
                // 즉 case 2:
                //    case 3:
                //        coupon = 3000; 으로 사용해도 된다.
                // case 즉 grade의 값이 2거나 3이면 3000원 쿠폰 발급이라는 뜻
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;

        }
        System.out.println("쿠폰을 통해 할인 받을 수 있는 가격은 " + coupon + "원 입니다." );
    }

    // 이런 경우는 거의 없다.
    // switch문은 결과가 나오는 조건이 아니라 단순한 값만 넣을 수 있다.
    // 즉, 값이 같은지 확인하는 연산만 가능하다.
    //  - 숫자가 아닌 문자도 가능
    // if문으로 switch문을 대체할 수 있으나, 특정 경우 switch문을 사용해 좀 더 간결한 코드를 사용 가능하다.
    // 실무에서는 if문을 대부분 사용한다.
}
