package method;

public class Overloading1 {
    // 메서드 오버로딩 : 이름이 같고 매개변수가 다른 메서드를 여러 개 정의하는 것
    //  - 오버로딩(과적), 같은 이름의 메서드를 여러개 정의했다고 이해하면 된다.

    // 두 수를 더하는 메서드, 세 수를 더하는 메서드를 만들고 싶은데 같은 이름인 add를 사용하고 싶다.
    // 자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분하므로 이름이 같고 매개변수가 다른 메서드를 정의할 수 있다.
    // add(int a, int b), add(int a, int b, int c), add(double a, double b) 모두 정의 가능

    // 오버로딩의 규칙
    //  - 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다.
    //  - 반환타입이 다른 것은 오버로딩으로 인정하지 않는다.
    //   - int add(int a, int b), double add(int a, int b)는 오버로딩 X
    //  - 변수의 이름만 다른 것도 인정하지 않는다.
    //   - int add(int a, int b), int add(int c, int d)는 오버로딩 X

    // 메서드 시그니처(Method Signature) : 메서드 이름 + 매개변수 타입(순서, 개수)
    //  - 메서드를 구별할 수 있는 고유한 식별자나 서명 즉, 기준을 의미한다.

    public static void main(String[] args) {
        System.out.println("1 : " + add(1, 2));
        System.out.println("2 : " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
