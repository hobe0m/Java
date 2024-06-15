package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위, 후위 증감 연산자
        // 증감 연산자는 피연산자 앞뒤에 둘 수 있으며 위치에 따라 연산 수행 시점이 달라진다.
        // 피연산자 앞에 쓰이면 전위(증가시키고 사용), 뒤에 쓰이면 후위(사용 후 증가)

        // 전위 증감 연산자의 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        // ctrl + r, shift + F10 : 마지막에 실행했던 코드를 다시 실행
        // ctrl + shift + F10 : 현재 코드(클래스, 메소드) 실행

        // 후위 증감 연산자의 사용 예
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 먼저 대입하고, a를 증가시킨다.
        System.out.println("a = " + a + ", b = " + b);

        int c = 1;
        int d = 2;

        int sum = ++c + 1 + (c * d);
        // 연산 전 변수의 값 변경이 우선된다.
        System.out.println("sum = " + sum);

        // 후위 증감 연산자는 다른 연산이 모두 수행된 후, 변수의 증감 연산이 수행된다.
        // 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에 전위든 후위든 결과가 같다.
        
    }
}
