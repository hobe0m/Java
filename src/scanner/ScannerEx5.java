package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = 0;

        System.out.println("첫 번째 숫자를 입력하세요.");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        /*
        for문 사용
        System.out.print("두 숫자 사이의 모든 정수 : ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(", ");
            }
        }

        */

        // while문 사용
        System.out.print("두 숫자 사이의 모든 정수 : ");
        while (num1 <= num2) {
            System.out.print(num1);
            if (num1 != num2) {
                System.out.print(", ");
            }
            num1++;
        }
    }
}
