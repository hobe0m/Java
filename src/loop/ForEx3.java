package loop;

public class ForEx3 {
    public static void main(String[] args) {

        // max와 sum은 위에서 초기화 해도 된다.
        //  - int max = 100;, int sum = 0;
        // 그렇게 하면 출력문을 for문 바깥에서도 사용할 수 있다.
        for (int i = 1, max = 100, sum = 0; i <= max; i++) {
            sum += i;
            System.out.println("1부터 " + i + "까지의 합은 " + sum + "입니다.");
        }

    }
}
