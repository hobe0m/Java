package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // 곱셈 먼저 실행 후, 덧셈
        int sum4 = (2 * 2) + (3 * 3); // sum3과 결과가 같지만, 복잡한 연산을 조금 더 쉽게 파악할 수 있게 도와준다.

        // 즉, 괄호를 사용해 복잡한 연산을 읽기 쉽게 해준다.
        // 코드를 몇 자 줄여서 모호하거나 복잡해지는 것보다는 더 많더라도 단순한 것이 유지보수하기 좋다.
        // 연산자 우선순위가 애매하거나 모호할 경우 괄호를 써주면 된다.
        // 코드를 보고 생각을 해야되는 경우 괄호를 넣어주면 된다.

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 연산자 우선순위 암기법
        // 괄호가 제일 우선, 대입연산자가 제일 마지막

        // 1. 상식선에서 우선순위를 사용하자
        // 2. 애매하면 괄호를 사용하자
        // 누구나 코드를 보면 쉽고 명확하게 이해할 수 있어야 한다.
        // 단순함과 명확함 즉, 상식선 그리고 괄호를 통해 우선순위를 파악하자
        // 하다가 필요하면 찾아서 보면 된다.
    }
}