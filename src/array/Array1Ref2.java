package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        // 1차원 배열 리팩토링 1
        // 리팩토링 : 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고 유지보수를 용이하게 하는 과정
        //  - 작동하는 기능은 같지만 코드만 개선하는 것

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 인덱스를 i로 지정, (i + 1)은 인덱스가 0부터 시작하기 때문에 사용한다.
        // i = 0부터 시작하는 이유는 인덱스가 0부터 시작하기 때문이다.
        for (int i = 0; i < 5; i++) { // 5대신 students.length(조회만 가능)로 사용해도 된다.
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
        
        // 횟수가 정해져 있기 때문에 for문을 사용하는 것이 적합하다.
    }
}
