package loop;

public class Nested1 {
    public static void main(String[] args) {
        // 중첩 반복문 : 반복문 안에 반복문이 존재하는 구조
        // 달력의 월과 일을 구할 때 용이하다.
        // 중첩하면 내부 for문은 곱의 형태만큼 실행된다 외부(2) * 내부(3) 총 6번의 내부 for문 실행

        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for문 시작 i : " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for문 " + i + "-" + j);
            }
            System.out.println("외부 for문 종료 i : " + i );
            System.out.println();
        }
    }
}
