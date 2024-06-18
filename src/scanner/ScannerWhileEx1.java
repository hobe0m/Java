package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = scanner.nextLine();

            // 이름을 입력할 때 "종료"를 입력하면 break를 거는 것이므로, 이름을 입력받은 후 if문을 작성해야 한다.
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("나이를 입력하세요.");
            int age = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력 후 줄바꿈 처리

            // 이 자리에 if문을 넣어 "종료" 타이핑 시 프로그램을 종료하게끔 하면 나이만 계속 타이핑하게 된다.

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }
    }
}
