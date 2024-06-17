package loop;

public class While1_2 {
    public static void main(String[] args) {
        // while문은 조건에 따라 코드를 반복해서 실행할 때 사용한다.
        // 조건식이 참이면 코드블럭 실행 후 다시 조건식으로 돌아와 참 거짓 확인
        // 거짓일 경우에는 코드블럭 실행 X while문 끝으로 이동, 거짓일 때까지 무한 반복

        int count = 0;

        while (count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는 : " + count);
        }
    }
}
