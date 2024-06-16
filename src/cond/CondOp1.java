package cond;

public class CondOp1 {
    public static void main(String[] args) {
        // 삼항 연산자 : 단순히 참과 거짓에 따라서 특정 값을 구하는 것
        // ? A : B 를 통해 참일 때는 A, 거짓일 때는 B를 출력한다.
        // 항이 3개라서 삼항 연산자라고 하기도 한다.

        int age = 18;
        String status;

        if (age == 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }
}
