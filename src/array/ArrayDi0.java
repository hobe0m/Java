package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        // 1차원 배열 : 단순히 순서대로 나열된 것
        // 2차원 배열 : 행과 열로 구성되는 것, int[][] arr(변수이름) = new int[2][3]의 형태로 사용해야 한다.
        // 먼저 행(몇번째 줄)을 찾고 그 다음에 열(몇번째 위치)을 찾는다.
        //  - 즉 row부터 찾고 column을 나중에 찾는다.

        // 2 x 3, 2차원 배열 생성

        int[][] arr = new int[2][3]; // 행 2, 열 3

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열

        // 0행 출력
        System.out.print(arr[0][0] + " "); // 0열
        System.out.print(arr[0][1] + " "); // 1열
        System.out.print(arr[0][2] + " "); // 2열

        System.out.println(); // 한 행이 끝나면 라인 변경

        // 1행 출력
        System.out.print(arr[1][0] + " "); // 0열
        System.out.print(arr[1][1] + " "); // 1열
        System.out.print(arr[1][2] + " "); // 2열


    }
}
