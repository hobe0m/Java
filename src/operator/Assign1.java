package operator;

public class Assign1 {
    public static void main(String[] args) {
        // 대입 연산자
        // 값을 변수에 할당해주는 연산자
        // 축약(복합) 연산자 : 산술 연산자와 대입 연산자를 한번에 축약해서 사용하는 연산자
        // +=, -=, *=, /=, %= 등

        int a = 5;
        a += 3; // 3을 더한 후 a에 대입
        System.out.println(a);

        a -= 2; // 2를 뺀 후 a에 대입
        System.out.println(a);

        a *= 4; // 4를 곱한 후 a에 대입
        System.out.println(a);

        a /= 3; // 3으로 나눈 후 a에 대입
        System.out.println(a);

        a %= 5; // 5로 나눈 후 나머지를 a에 대입
        System.out.println(a);
    }
}
