package cond;

public class Switch4 {
    public static void main(String[] args) {
        // 새로운 Switch문, 자바 14이상에서 사용가능

        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("쿠폰에 의한 할인 가능 가격은 " + coupon + "원 입니다.");
    }

    // 기존 Switch문과의 차이점은 ->를 사용한다는 점과 선택된 데이터(coupon)를 반환할 수 있다는 점이다.
}
