package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        // 배열의 선언과 생성
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

        int[] students; // 배열 변수 선언
        students = new int[5]; // int형 변수를 다섯개 집어넣을 수 있는 하나의 그릇 생성, 배열 생성, 배열 생성 시 자동으로 0(숫자), false(논리), null(문자형)로 초기화
        // 배열은 생성하면 참조값을 보관하여 접근한다.
        // 참조값을 통해 메모리에 있는 실제 배열에 접근 후 사용할 수 있다.
        // 배열 생성 -> 참조값 보관 -> 참조값 참조 -> 메모리에 있는 실제 배열에 접근 후 사용
        // 변수가 배열 자체인 것은 아니고, 참조값만 가지는 것
        
        System.out.println(students); // [I (int형 배열) + 참조 주소(메모리의 주소)

        // 변수 값 대입
        students[0] = 90; // 배열은 0번부터 시작
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생 1의 점수 : " + students[0]);
        System.out.println("학생 2의 점수 : " + students[1]);
        System.out.println("학생 3의 점수 : " + students[2]);
        System.out.println("학생 4의 점수 : " + students[3]);
        System.out.println("학생 5의 점수 : " + students[4]);

        // 인덱스 : 배열의 위치를 나타내는 숫자, 대괄호([]) 사이의 숫자가 인덱스이다.
        // new int[5]의 배열을 만들었으면 인덱스는 0,1,2,3,4 즉, 0부터 5개가 존재한다.

        // 기본형 vs 참조형 (Java의 변수 데이터 타입의 대분류)
        // 기본형(Primitive Type) : 사용하는 값을 직접 넣을 수 있는 것
        // 참조형(Reference Type) : 메모리의 참조값(주소)만 넣을 수 있는 것

        // 배열은 코드가 실행되는 시점에 크기가 정해지므로 메모리의 할당값을 모르기 때문에 참조형을 사용한다.
        // 즉, 크기를 동적으로 할당(동적 메모리 할당, 동적으로 사이즈 변경 가능)할 수 있다.
        // 반면 기본형은 크기가 선언시에 다 정해져 있다.
    }
}
