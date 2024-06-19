package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 직접 값을 입력하는 것이 아닌 배열에 크기만큼 숫자가 자동 입력
        int[][] arr = new int[4][5];

        // 배열을 돌면서 숫자 자동 입력
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) { // arr.length : 행의 개수
            for (int column = 0; column < arr[row].length; column++) { // arr[row].length : 열의 개수, 행을 선택 후 개수의 길이 파악
                System.out.print(arr[row][column] + " "); // 0열
            }
            System.out.println(); // 한 행이 끝나면 라인 변경
        }
    }
}
