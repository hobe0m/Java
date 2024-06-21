package method;

public class MethodValue3 {
    // 메서드 호출과 값 반환받기
    // shift + F6 : 코드 한번에 수정, 코드 및 문장 한번에 수정
    public static void main(String[] args) {
        int num1 = 5; // main 메서드에 있는 num1
        System.out.println("changeNumber 호출 전, num1 : " + num1);
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1 : " + num1);
    }

    public static int changeNumber(int num2) { // 데이터형(반환타입)과 void(반환타입이 없을 때) 둘 중 하나는 써줘야 한다.
        num2 = num2 *2;
        return num2;
    }

    // 나중에 배울 참조형도 참조형 변수에 있는 값인 참조값을 복사하는 것이다.
}
