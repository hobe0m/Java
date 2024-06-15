package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;

        // 논리연산자는 비교연산자의 결과를 비교하는데에 사용
        // a가 10보다 크고 20보다 작다를 논리연산자를 활용하여 확인
        boolean result = a > 10 && a < 20;
        boolean result2 = 10 < a && a < 20; // 이런 식으로도 사용 가능
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}
