package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 9;
        int discount = 0; // 현재 할인 가격

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인금액 없음");
        }

        System.out.println("총 할인 금액 " + discount + "원" );

        if (false)
            System.out.println("if문에서 실행된다.");
            System.out.println("if문에서 실행 안된다.");
        // if문이 한 줄일 때는 코드블럭을 생략 가능하다.
        // 두 번째 문장은 if문과 무관하다.
        // 다만 생략하지 않는 것을 권장하기에 무조건 코드블럭을 쓴다고 생각하자(가독성과 유지보수성 향상)


    }

    // 두 가지가 독립시행일 때 else if문을 사용하면 하나의 시행밖에 하지 못해 if문을 각각 사용해야 한다.
    // 이 경우에는 if문을 사용해야 한다.
    // 하나의 할인밖에 못받기 때문이다.
}

