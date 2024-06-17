package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        // count 변수 초기화, 1씩 더하는 코드를 작성하기 때문에 1이 아닌 0을 사용한다.
        int count = 0;

        // while문 사용, count를 10까지 출력하기에 10보다 작으면 +1을 해서 출력한다는 코드를 사용한다.
        while (count < 10) {
            count = count + 1;
            System.out.println(count);
        }

        System.out.println();

        // for문 사용(초기식 - 조건문 - 코드 - 증감식)
        // count2의 초기화를 1로 하는 이유 : 0이어도 조건에 맞아 출력되기 때문
        // 10까지는 출력 해야 하기 때문에 조건이 11미만 이어야 한다.
        for (int count2 = 1; count2 < 11; count2++) {
            System.out.println(count2);
        }
    }
}
