package loop;

public class Break1 {
    public static void main(String[] args) {
        // break와 continue는 반복문에서 사용하는 키워드
        // break는 반복문을 즉시 종료하고 나가고, continue는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용된다.
        // 모든 반복문에서 사용 가능하다.
        // break는 while문 종료, continue는 아래 코드를 실행하지 않고 조건문으로 이동

        int sum = 0;
        int i = 1;
        
        // while(true)는 무한반복을 의미
        while (true) {
            sum = sum + i;

            // sum이 10보다 클 때만 출력
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + " sum = " + sum);
                // 원하는 결과가 출력되면 break로 while문을 빠져 나온다.
                break;
            }
            i++;
        }
    }
}
