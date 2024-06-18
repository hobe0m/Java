package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("문자열을 입력하세요.");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                // while문 안에 위치하기 때문에 벗어나려면 break를 넣어줘야 한다.
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}