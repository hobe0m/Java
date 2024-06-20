package method;

public class Method1 {
    public static void main(String[] args) {
        // 메서드(함수)
        // 동일한 연산을 반복해야 할 때 연산을 하나의 메서드로 지정해서 여러 군데에서 호출해 사용한다.
        
        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과 1 출력 : " + sum1);

        System.out.println("==================");

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과 2 출력 : " + sum2);
        
        // 함수(자바에서는 메서드라고 한다)
        // 숫자 2개를 집어 넣으면 그 숫자 2개를 더한 값을 출력하는 것을 add(함수)로 정의
        // 이름은 add, a,b라는 두 값을 받으며, a + b 연산을 수행한다.
        // 함수에 값을 입력하면, 함수가 가진 연산을 처리한 다음 결과를 출력한다.
        // 함수는 블랙박스와 같아서 외부에서 호출할 때는 필요한 값만 입력하면 된다(내부 구조 파악 필요 없음).
        // 같은 함수는 다른 입력 값으로 여러번 호출 가능하다.
        // 핵심은 함수를 한번 정의해두면 계속해서 재사용할 수 있다는 점이다.
        // 예시, avg(a, b) = (a + b) / 2
    }
}
