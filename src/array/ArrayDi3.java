package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2차원 배열 리팩토링 3
        // 초기화와 배열의 길이 구조 개선

        // 2 x 3 2차원 배열을 만든다.
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} // row와 column을 추가해서 확인
        }; // 2행 3열의 배열을 만듦, 1차원과 마찬가지로 new int[][]도 생략가능하다.

         // 0행 출력
        for (int row = 0; row < arr.length; row++) { // arr.length : 행의 개수
            for (int column = 0; column < arr[row].length; column++) { // arr[row].length : 열의 개수, 행을 선택 후 개수의 길이 파악
                System.out.print(arr[row][column] + " "); // 0열
            }
            System.out.println(); // 한 행이 끝나면 라인 변경
        }
    }
}
