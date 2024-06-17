package loop;

public class ForEx1 {
    public static void main(String[] args) {

        // for문 사용(초기식 - 조건문 - 코드 - 증감식)
        // count2의 초기화를 1로 하는 이유 : 0이어도 조건에 맞아 출력되기 때문
        // 10까지는 출력 해야 하기 때문에 조건이 11미만 이어야 한다.
        for (int count = 1; count < 11; count++) {
            System.out.println(count);
        }
    }
}
