package loop;

public class While2_2 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 3번 더해라(1 ~ 3 더하기)
        int sum = 0;
        
        // 변수를 선언해 조금 더 쉽게 변경
        int i = 1;

        sum = sum + i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println("i = " + i + " sum = " + sum);
    }
}
