package method;

public class MethodCasting1 {
    // 메서드를 호출할 때도 형변환이 적용된다.
    // 메서드 호출과 명시적 형변환, 자동 형변환

    // 명시적 형변환
    public static void main(String[] args) {
        double number = 1.5;
        printNumber((int)number); // number는 double형이라 담을 수 없으므로(컴파일 오류 발생) (int)를 통해 명시적으로 형변환을 시켜주어야 한다.
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
