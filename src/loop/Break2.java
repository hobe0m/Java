package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;

        /* 내 풀이
        for (int i = 1; sum <= 10; i++) {
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        */
        int i = 1;

        for ( ; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + ", sum = " + sum);
                break; // 무한 반복이기 때문에 조건 만족 시 break를 통해 빠져나가게 해야한다.
            }
            i++;
        }
    }
}
