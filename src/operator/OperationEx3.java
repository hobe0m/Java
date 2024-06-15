package operator;

public class OperationEx3 {
    public static void main(String[] args) {
        int score = 70;
        boolean result1 = score >= 80;
        boolean result2 = score <= 100;
        boolean result3 = 80 <= score && score >= 100;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
