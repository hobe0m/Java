package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력하세요.");
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            // 0이 아니면 break에 걸리지 않고 while문이 반복되므로 sum에 입력되는 정수를 계속 더해주는 sum += number를 break 하단에 넣어준다.
            sum += number;
        }
        System.out.println("입력한 모든 정수의 합 : " + sum);
    }
}
