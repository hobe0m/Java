package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m); // 블록의 내부에서 외부의 변수는 접근 가능하다.
            System.out.println("for i = " + i);
        }

        System.out.println("main m = " + m);
        // System.out.println("main i = " + i); 마찬가지로 for문 안에서 선언한 변수는 for문의 블록 안에서만 사용할 수 있다.
    }
}
