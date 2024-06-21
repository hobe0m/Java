package method;

public class MethodValue0 {
    // 메서드 호출과 값 전달
    // ** 자바는 항상 변수의 값을 복사해서 대입힌다. **
    //  - 반드시 이해해야 한다.

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // num1에 있는 값을 읽고 복사해서 num2에 대입 즉, num1은 그대로 유지하되 num2에 복사된 값이 들어간다.
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // num1의 값을 num2에 넣어도 num1의 기존 값은 유지되고, 복사된 새로운 값이 num2에 들어간다.
    }
}
