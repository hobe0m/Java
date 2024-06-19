package array;

public class Array1 {
    public static void main(String[] args) {
        // 배열이 필요한 이유
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;
        int student6 = 40;
        int student7 = 30;

        System.out.println("학생 1의 점수 : " + student1);
        System.out.println("학생 2의 점수 : " + student2);
        System.out.println("학생 3의 점수 : " + student3);
        System.out.println("학생 4의 점수 : " + student4);
        System.out.println("학생 5의 점수 : " + student5);
        System.out.println("학생 6의 점수 : " + student6);
        System.out.println("학생 7의 점수 : " + student7);

        // 학생을 추가하면 변수 선언 부분, 점수 출력 코드 둘 다 추가해야 하고 많은 수가 추가되면 기하급수적으로 추가된다.
        // 또한 비슷한 변수를 계속 반복해서 선언하는 문제가 발생한다.
        // 반복문으로 해결 X, 변수명은 바꿀 수 없기 때문이다.

        // 같은 타입의 변수를 반복해서 선언하고 반복해서 사용하는 문제를 해결하는 것이 배열이다.
    }
}
