package cond;

public class If5 {
    public static void main(String[] args) {
        // 서로 연관된 조건이어서 하나로 묶을 때는 if와 else if를 사용
        // 독립 조건(서로 연관되지 않았을 때), 각각 실행해야 할 때는 if문을 각각 사용해야 한다.


        /*

        처음 생각한 코드, 할인 후 금액까지 생각

        int price = 14000;
        int age = 9;

        if (price >= 10000) {
            price -= 1000;
            System.out.println("10000원 이상 구매로 인해 할인된 가격은 " + price + "원입니다.");
        }
        
        if (age <= 10) {
            price -= 1000;
            System.out.println("나이를 통한 할인으로 인해 가격은 " + price + "원입니다.");
        }
        */

        // 할인되는 금액만 생각
        
        int price = 10000;
        int age = 9;
        int discount = 0; // 현재 할인 가격

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 " + discount + "원" );
    }
}
