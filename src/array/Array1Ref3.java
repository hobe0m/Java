package array;

public class Array1Ref3 {
    public static void main(String[] args) {

        // 1차원 배열 리팩토링 2

        int[] students;
        students = new int[] {90, 80, 70, 60, 50}; // 배열 생성과 초기화, 중괄호({})안에 배열에 넣고 싶은 값을 넣는다.

        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
