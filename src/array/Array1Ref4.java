package array;

public class Array1Ref4 {
    public static void main(String[] args) {

        // 1차원 배열 리팩토링 3

        int[] students = {90, 80, 70, 60, 50, 40, 30, 20, 10}; // 배열 생성과 초기화, 중괄호({})안에 배열에 넣고 싶은 값을 넣는다.
        // int[] 이걸 보고 {}만 써도 int형 배열임을 짐작해서 만들어준다.

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
