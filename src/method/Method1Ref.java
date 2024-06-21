package method;

public class Method1Ref {
    public static void main(String[] args) { // main 메서드
        // 메서드 사용
        // 함수가 더 큰 개념이고, 그 안에 메서드가 있다.
        //  - 즉 함수 안에 메서드가 있다고 생각하면 된다.

        // ctrl + (b) + 메서드명 클릭 : 해당 메서드로 이동
        
        // 계산 1
        int sum1 = add(5, 10);
        System.out.println("결과 1 출력 : " + sum1);

        System.out.println("==================");

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과 2 출력 : " + sum2);

        // 반환값 무시
        //  - 반환 타입이 있는 메서드를 호출했는데 만약 반환값이 필요없다면 사용하지 않아도 된다(단순 호출 가능).
        //  - add(100, 200)은 반환된 값을 사용하지 않고 버리고, int sum2 = add(15, 20)는 반환된 값을 sum2에 저장한다.
        add(100, 200);
    }

    // add 메서드 생성
    // 메서드만 수정하면 사용하는 지점들이 한번에 다 바뀐다.
    // 중복이 제거되고, 코드가 깔끔해진다.
    public static int add(int a, int b) { // add 메서드
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum; // 결과를 반환(함수를 실행하면 결과를 출력해야 된다.)
    }

    // 메서드는 크게 메서드 선언과 메서드 본문으로 나눌 수 있다.

    // public static int add(int a, int b) : 메서드 선언[메서드 이름(add), 반환 타입(int), 파라미터(매개 변수, int a와 int b) 목록을 포함]
    // 메서드 선언 정보를 통해 다른 곳에서 해당 메서드 호출 가능
    // public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻
    // static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻
    // 메서드 선언에 사용되는 변수를 영어로 파라미터, 한글로 매개변수, 데이터 형이 존재한다.

    /*
    // 메서드 본문

     {
     System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
     }

     메서드가 수행해야 하는 코드 블럭
     메서드를 호출하면 본문이 순서대로 실행된다.
     메서드 본문은 블랙박스, 선언하는 곳에서는 본문을 몰라도 된다.
     메서드의 실행 결과를 반환하려면 return문을 사용해서 return문 다음에 반환할 결과(타입이 일치해야 한다)를 적어주면 된다.
    */

    // 메서드를 호출하면 메서드는 계산을 끝내고 결과를 반환한다.
    //  - 즉, 메서드 호출이 끝나면 해당 메서드라 반환한 결과 값으로 치환된다.
    // 메서드 호출이 끝나면 메모리 낭비할 필요가 없으므로 정의에 사용한 파라미터 변수나 그 안에서 정의한 변수들도 모두 제거된다.

    // 메서드 호출과 용어 정리
    // 메서드를 호출할 때는 메서드에 넘기는 값과 파라미터의 타입이 맞아야 한다.
    //  - 넘기는 값과 파라미터의 순서 및 개수도 맞아야 한다.
    // 정의 : int call(String str, int age), 호출 : call("hello, 20) 이런 방식

    // 인수(Argument) : 메서드를 호출할 때 넘기는 값, 인수 또는 인자라고 한다.
    //  - 들어가는 수, 메서드 내부로 들어가는 값을 의미
    //  - "hello", 20
    // 매개변수(Parameter) : 메서드를 정의할 때 선언한 변수
    //  - 중간에서 전달하는 변수, 즉 메서드 호출부(호출자의 인수를 받아서)와 메서드 내부 사이에서 값을 전달하는 역할을 하는 변수
    //  - str, age
}
