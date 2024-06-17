package loop;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        int i = 1;

        while (i <= max) {
            sum += i;
            System.out.println("1부터 " + i + "까지의 합은 " + sum + "입니다.");
            i++;
        }
    }
}
