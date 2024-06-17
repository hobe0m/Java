package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        // do-while문 : while문과 비슷하지만 조건에 상관없이 무조건 한 번은 코드를 실행한다.
        // 조건은 만족하지 않아도 한번은 현재 값을 출력하고 싶을 때 사용
        int i = 10;

        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
    
    // do에 코드블럭을 넣고 while을 뒤에 사용해 조건을 명시;
    // 따라서 while의 조건이 일치하지 않더라도 코드블럭 한번 실행 후 종료
    // 참이면 계속 실행한다.
}
