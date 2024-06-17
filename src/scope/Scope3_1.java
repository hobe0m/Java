package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        // 스코프의 존재 이유

        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }

    // 위의 코드는 좋은 코드는 아니다.
    // temp는 if절 안에서 임시로 사용하지만 main 코드 블럭에 선언했기 때문이다.
    // 따라서 비효율적인 메모리 사용 및 코드 복잡성 증가라는 단점이 있다.

}
