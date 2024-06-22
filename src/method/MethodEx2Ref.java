package method;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("hello, world!", 3);
        printMessage("hello, world!", 5);
        printMessage("hello, world!", 7);
    }

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
            // return문을 명시적으로 적으면 i++가 실행되지 않고 그대로 종료된다.
            // void는 return문이 생략되어 있으므로 적지 않아도 된다.
        }
    }
}