package loop;

public class While2_3 {
    public static void main(String[] args) {

//        int sum = 0; // 합계를 담는다.
//        int i = 1; // 시작 숫자, 1부터 3까지 합이라면 50
//        int endNum = 3; // 마지막 숫자, 1부터 3까지 합이라면 100
//
//        // while문의 조건이 거짓이 될 때까지 코드블럭이 반복해서 실행된다.
//        while (i <= endNum) {
//            sum = sum + i;
//            System.out.println("i = " + i + " sum = " + sum);
//            i++;
//        }


        // 3부터 49까지의 합을 구해라
        int sum = 0;
        int i = 3;
        int endNum = 49;

        while ( i < 50 ) {
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }
    }
}
