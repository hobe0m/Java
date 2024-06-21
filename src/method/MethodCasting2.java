package method;

public class MethodCasting2 {
    // 메서드를 호출할 때도 형변환이 적용된다.
    // 메서드 호출과 명시적 형변환, 자동 형변환

    // 자동 형변환
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int값(인수)을 double형(매개변수)에다 넣어주는 것은 자동 형변환이 되어 들어가므로 문제없이 잘 동작한다.
    }

    public static void printNumber(double n) {
        System.out.println("숫자 : " + n);
    }

    // 메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다.
    //  - 자동형변환이 가능한 경우에는 자동으로 형변환이 실행되고, 명시적 형변환이 필요한 경우는 명시적으로 변경을 해주어야 한다.
}
