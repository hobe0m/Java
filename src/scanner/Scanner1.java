package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        // System.in을 통해 사용자의 입력을 받아 사용할 수 있다.
        // 하지만 복잡하기 때문에 Scanner 클래스를 제공한다.

        // Scanner scanner는 Scanner라는 변수에 scanner 라는 이름의 스캐너를 담는 것
        // 지금은 스캐너를 사용하려면 스캐너를 생성해야 된다는 정도만 알면 된다.
        // 생성 시 new를 이용한다.
        // 스캐너는 System.in을 통해 사용자의 입력을 편리하게 받도록 도와준다.
        Scanner scanner = new Scanner(System.in);

        // print만 쓰면 문자열을 입력하세요와 동일한 줄에 입력값이 입력된다.
        System.out.println("문자열을 입력하세요.");
        // 사용자의 입력 값을 String 타입에 저장한다.
        String str = scanner.nextLine(); // 아래 코드로 내려가지 않고 사용자의 입력을 기다린다.
        System.out.println("입력한 문자열 : " + str);

        System.out.println("정수를 입력하세요.");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue);

        System.out.println("실수를 입력하세요.");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);
        
        // scanner.nextLine() : 엔터(|n)을 입력할 때까지의 문자를 가져온다.
        // scanner.nextInt() : 입력을 int형으로 가져오며 정수 입력 시 사용
        // scanner.nextDouble() : 입력을 double형으로 가져오며 실수 입력 시 사용

        // 지정한 타입과 일치하지 않으면 오류가 발생한다.
        // print()는 출력 후 다음 라인으로 넘기지 않는다.
        // println()은 출력하고 다음 라인으로 넘긴다.
        // println("hello")는 print("hello|n")과 같다.
    }
}
