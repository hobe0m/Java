package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for ( int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + ", sum = " + sum);
                break;
            }
        }
        // 카운터 변수가 명확하거나, 반복 횟수가 정해진 경우에는 for문을 사용하는 것이 구조적으로 더 깔끔하고 유지보수하기 편하다.
        // 또한 for문을 사용하면 카운터 변수를 for문 안에서만 사용할 수 있기 때문에 scope의 측면에서 봐도 유리하다.
    }
}
