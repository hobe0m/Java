package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 문자열을 ""로 넣어 어떤 연산의 값이 7인지 표현

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나누기
        int div = a / b;
        System.out.println("a / b = " + div); // int형으로 계산하여 소수점이 표현되지 않음
        // 둘 다 int형을 사용하면 결과도 int형을 사용한다.
        // 따라서 double로 사용해야 한다.
        // 0으로 나누면 ArithmeticException 발생, 수학적 오류(수학적으로 접근 시 0으로는 나눌 수 없어 예외가 발생)
        // 예외가 발생했을 경우 이후 아래의 코드들도 실행되지 않고 프로그램이 종료된다.

        // ** 나머지(실무와 알고리즘에서 종종 사용되므로 잘 기억하자) **
        int mod = a % b;
        System.out.println("a % b = " + mod); // 5 나누기 2의 나머지(몫이 2, 나머지가 1)의 값이 나온다.


        // 삼항 연산자( ? : ), instanceof(객체 타입 확인), new, [](배열 인덱스), .(객체 멤버 접근), ()(메소드 호출)은 뒤에서 학습
        // 비트 연산자는 실무에서 거의 사용할 일이 없고, 필요할 때 찾아보면 된다.
        //  - %, |, ^, ~, <<, >>, >>>


    }
}
