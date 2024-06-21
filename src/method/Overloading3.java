package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1 : " + add(1,2));
        System.out.println("2 : " + add(1.0, 2.0));

    }

    // 이 메서드가 없어도 자동형변환을 통해 코드는 정상적으로 작동한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}

// 메서드는 본인의 타입과 제일 비슷한 타입을 먼저 찾아 실행하고 없다면 캐스팅(형변환)해서 비슷해질 수 있는 메서드를 찾는다.
