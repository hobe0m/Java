package operator;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);

        int average = (num1 + num2 + num3) / 3;
        System.out.println("average = " + average);

        // 소수점을 버리지 않으려면 double 사용

        int num4 = 11;
        int num5 = 12;
        int num6 = 15;

        // 결과 값만 double을 넣는 것이 아니고 피연산자 중 하나를 double로 바꿔주어야 한다.
        double average2 = (num4 + num5 + num6) / 3.0;
        System.out.println("average2 = " + average2);
    }
}
