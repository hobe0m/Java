package operator;

import java.sql.SQLOutput;

public class Logical1 {
    public static void main(String[] args) {

        // 논리연산자, boolean형인 true와 false를 비교하는데 사용한다.
        // &&(그리고) : 두 피연산자 모두가 참이여야 참이고, 하나라도 거짓이면 거짓
        // ||(또는) : 두 피연산자 중 하나만 참이면 참, 둘 다 거짓이면 거짓
        // !(부정) : 피연산자의 논리적 부정을 반환, 즉 참이면 거짓, 거짓이면 참을 반환

        // ctrl + shift + z : 문장을 완성시킨 후 사용하면 다음 라인의 제일 처음으로 이동한다.
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);



    }
}
