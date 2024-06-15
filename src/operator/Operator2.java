package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 자바에서는 문자열 사이에 +를 사용하여 문자열을 합칠 수 있다.

        // 문자열과 문자열 더하기 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자랑 숫자를 더했을 경우 문자열과 합쳐지는 숫자를 문자로 바꾼다.
        // 숫자가 아닌 다른 대상도 문자열로 바꾼다

        // 문자열과 숫자 더하기 2
        // 변수에 숫자를 담아 문자열과 더해도 문자열로 변환 후 합쳐 연결된 문자열을 만든다.
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

    }
}
