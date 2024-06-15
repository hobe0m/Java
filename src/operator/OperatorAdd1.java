package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        // 증감 연산자, 증가 및 감소연산자를 줄여 말하는 말
        int a = 0;

        // 기존의 a에 1 더하기
        a = a + 1;
        System.out.println("a = " + a);

        // 기존에 a에 1 더하기
        a = a + 1;
        System.out.println("a = " + a);

        // 변수에 1을 더하거나 빼는 일이 비일비재해서 증감연산자 사용
        ++a; // a = a + 1과 동일
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        --a;
        System.out.println("a = " + a);

    }
}
