package operator;

public class Comp1 {
    public static void main(String[] args) {
        // 비교 연산자, 두 값을 비교하는 데 사용되며 주로 조건문과 함께 사용
        // ==(동등성), !=(불일치), >(크다), <(작다), >=(크거나 같다), <=(작거나 같다)
        // !는 반대라는 뜻이다.

        // 비교 연산자를 사용하면 true 혹은 false의 결과가 나오기 때문에 boolean형을 사용한다.
        // =(대입)와 ==(비교)는 다르다.

        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 비교연산자의 결과를 boolean 변수에 담을 수 있다.
        boolean result = a == b;
        System.out.println("result = " + result);

    }
}
