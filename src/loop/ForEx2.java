package loop;

public class ForEx2 {
    public static void main(String[] args) {

        // for문의 경우 기본식(변수 초기화), 조건문, 증감식이 다 포함되어야 한다.
        // 코드는 조건문이 맞을 때 반복될 코드만 작성
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
