package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요.");
            double num1 = scanner.nextDouble();
            System.out.println("입력한 숫자 : " + num1);

            System.out.println("두 번째 숫자를 입력하세요.");
            double num2 = scanner.nextDouble();
            System.out.println("입력한 숫자 : " + num2);

            if (num1 == 0 && num2 == 0) {
                System.out.println("두 숫자가 모두 0이므로 프로그램을 종료합니다.");
                // while문 안에 위치하기 때문에 벗어나려면 break를 넣어줘야 한다.
                break;
            }
            double sum = num1 + num2;
            System.out.println("두 숫자의 합은 : " + sum + "입니다.");
        }

    }
}
