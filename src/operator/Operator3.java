package operator;

public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; // 연산자 우선순위로 인해 곱셈이 먼저 실행된다.
        int sum2 = (1 + 2) * 3; // 연산자 우선순위로 인해 소괄호 안의 내용이 먼저 실행된다.

        // soutv = 구할 변수를 골라 앞에 문자열로 변수 = 을 붙여 출력해준다.
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

    }
}
