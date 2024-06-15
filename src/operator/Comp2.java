package operator;

public class Comp2 {
    public static void main(String[] args) {

        // 문자열 비교
        // 문자열 비교에는 ==이 아니라 .equals() 메서드를 사용해야 한다.

        String str1 = "문자열1";
        String str2 = "문자열2";

        // "비교할 문자열1".equals("비교할 문자열2")의 형태로 사용한다.
        boolean result1 = "hello".equals("hello"); // 리터럴 비교

        boolean result2 = str1.equals("문자열1"); // 문자열 변수와 리터럴을 비교

        boolean result3 = str1.equals(str2); // 문자열 변수와 문자열 변수의 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // ctrl + shift + enter : 현재 코드를 완성(세미콜론)시켜준다.
        System.out.println(result3);
    }
}
