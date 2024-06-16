package cond;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 6;
        
        /*
        String result = (x % 2 == 0) ? "x = " + x + ", 짝수" : "x = " + x + ", 홀수";
        System.out.println(result);
        */

        // 계산식에 출력결과를 넣지 말고, 출력 시에 포함되게 변경
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);

    }
}
