package cond;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String result = (a > b) ? "더 큰 숫자는 10입니다." : "더 큰 숫자는 20입니다.";
        System.out.println(result);

        // 삼항 연산자
        //  - 출력할 데이터형(String) 데이터 이름(result) = (조건) ? (참일 때 출력 값, 데이터 형에 맞게) : (거짓일 때 출력 값, 데이터 형에 맞게)

        int c = 30;
        int d = 40;

        int result2 = (c > d) ? 30 : 40;
        System.out.println(result2);

    }
}
