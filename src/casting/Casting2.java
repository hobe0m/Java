package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 명시적 형변환
        // 큰 범위에서 작은 범위로의 형변환

        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; - 컴파일 오류 발생(타입이 맞지 않고, 자동 형변환이 불가능하기 때문)
        //  - 큰 컵에 있는 물을 작은 컵으로 옮긴다고 하면 자연스럽게 손실이 발생한다는 오류
        intValue = (int) doubleValue; // int형으로 명시적 형변환
        System.out.println("intValue = " + intValue); // int형으로 바뀌면서 1.5 -> 1이 된다.

        int z = (int) 10.5;
        System.out.println(10.5);
        System.out.println((int)10.5);

        /*
        명시적 형변환 과정
        doubleValue = 1.5;
        intValue = (int) doubleValue;
        intValue = (int) 1.5; - doubleValue에 있는 값을 읽는다.
        intValue = 1; - (int)로 형변환 실행 즉, intValue에 int형인 숫자 1 대입
        */

        System.out.println("doubleValue = " + doubleValue);

        // 형변환을 한다고 해서 doubleValue안에 있던 값 자체가 변하는 것이 아니고, 그 값을 형변환 해서 읽는 것뿐이다.
        // 변수의 값은 대입 연산자를 사용해서 직접 대입할 때만 변경된다.
    }
}
