package casting;

public class Casting4 {
    public static void main(String[] args) {
        // 계산과 형변환

        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 나누기의 결과는 1.5지만 int형이기 때문에 1로 출력된다.

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
        // 피연산자 중 하나라도 double로 캐스팅이 되어야 double 형태의 결과가 나온다.

        // 자바에서의 계산 원칙
        //  - 같은 타입끼리의 계산은 같은 타입의 결과를 낸다(큰 범위의 값을 결과로 내고 싶다면, 명시적 형변환을 피연산자에 실행).
        //   - int + int = int, double + double = double
        //  - 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
        //   - int + long = long, double + long = double
    }
}
