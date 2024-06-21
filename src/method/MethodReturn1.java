package method;

public class MethodReturn1 {
    // 반환 타입
    public static void main(String[] args) {
        boolean result = odd(1);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true; // 조건이 맞을 경우 true 출력
        } else {
            return false; // false인 경우도 반환해주기 위해 사용해야 한다.
        }
        // 모든 경우에서 return이 되게끔 코드를 작성해야 한다.
        // return문을 만나면 그 즉시 메서드를 빠져나간다(다른 로직을 수행하지 않는다).
    }
}
