package scope;

public class Scope1 {
    public static void main(String[] args) {
        // 변수는 선언한 위치에 따라 지역 변수, 멤버 변수(클래스 변수, 인스턴스 변수)와 같이 분류된다.
        // 여기서 배울 변수는 지역 변수
        // 지역 변수(Local Variable) : 특정 지역(변수가 사용된 코드 블럭)에서만 사용할 수 있는 변수
        // 코드 블럭 안에서 선언되면 그 안에서만 사용할 수 있고, 벗어나면 제거된다.
        // 변수의 접근 가능한 범위를 스코프(Scope)라고 한다.
        //  - Scope : 범위

        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
        System.out.println("main m = " + m);
        // System.out.println("main x = " + x);는 if 코드 블럭 안에서 선언되었으므로 코드 블럭을 벗어나면 제거된다.
        // m이 스코프의 범위가 길고, x는 짧다.
    }
}
