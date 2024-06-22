package method;

public class MethodEx1Ref {
    public static void main(String[] args) {
        // 리팩토링 : 짜여진 코드의 기능은 그대로 유지하되, 코드를 조금 더 간결하거나 유지보수가 용이하게 바꾸는 것
        System.out.println("평균값 : " + average(1,2,3));
        System.out.println("평균값 : " + average(15,25,35));


    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        // double average = sum / 3.0;
        return sum / 3.0;
    }
}
