package loop;

public class Continue1 {
    public static void main(String[] args) {
        // 1부터 5까지의 합을 구하는데 3일 때는 건너뛴다.
        // while과 if를 통해 반복문의 조건을 지정할 수 있다.
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
