package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // for문 사용 버전
        System.out.println("구구단의 단 수를 입력해주세요.");
        int num = scanner.nextInt();

        System.out.println(num + "단의 구구단입니다.");
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    /*
        // while문 사용 버전
        int num = scanner.nextInt();
        int count = 1;

        System.out.println(num + "단의 구구단입니다.");

        while (count < 10) {
            System.out.println(num + " x " + count + " = " + num * count);
            count++;
    */

        }
    }
