package method;

public class MethodValue2 {

    // 메서드 호출과 값 전달2
    // 메서드 호출과 이름이 같은 변수
    // 전과 결과는 동일
    // 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
    //  - 이름이 같아도 완전히 다른 변수이므로 main의 number와 changeNumber의 number가 서로 다른 변수이다.
    public static void main(String[] args) {
        int number = 5; // main 메서드에 있는 number
        System.out.println("1. changeNumber 호출 전, num1 : " + number); // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, num1 : " + number); // 5
    }

    public static void changeNumber(int number) { // changeNumber 메서드의 매개변수 number
        System.out.println("2. changeNumber 변경 전, num2 : " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2 : " + number); // 10
    }
}
