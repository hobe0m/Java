package method;

public class Method2 {
    // 메서드 정의
    // 제어자 반환타입 메서드이름(매개변수 목록) {
    //     메서드 본문
    // }

    // 제어자(Modifier) : public, static과 같은 부분, 지금은 무조건 public static을 써야된다고만 기억하자.
    // 반환 타입(Return Type) : 메서드가 실행된 후 반환하는 데이터의 타입을 지정, 메서드가 값을 반환하지 않는 경우 없다는 뜻의 void를 사용해야 한다.
    // 메서드 이름(Method Name) : 메서드의 이름으로 메서드를 호출하는데에 사용된다.
    // 매개변수(Parameter) : 입력 값으로, 메서드 내부에서 사용할 수 있는 변수, 매개변수는 옵션이고 입력값이 필요 없는 메서드는 매개변수를 지정하지 않아도 된다.
    //  - 인수는 직접 입력, 매개변수는 변수(호출하는데 사용)
    // 메서드 본문(Method Body) : 실제 메서드의 코드가 위치하며 중괄호({}) 사이에 코드를 작성한다.
    public static void main(String[] args) {
            /* String str = */ printHeader(); // 선언 시 반환타입이 지정되지 않았으므로 반환값(데이터형 정의)을 받으면 컴파일 오류 발생
            System.out.println("프로그램이 동작합니다.");
            printFooter();
        }

        public static void printHeader() {
            System.out.println(" = 프로그램을 시작합니다 = ");
            return; // 생략 가능
        }

        public static void printFooter() {
            System.out.println(" = 프로그램을 종료합니다 = ");
            return; // 생략 가능
        }

        // printHeader(), printFooter() 모두 매개변수가 없고 반환타입도 없다.
        // 매개변수가 없는 경우
        //  - 선언 시 매개변수를 비워두고 정의하면 된다.
        //  - 호출 시 인수를 비워두고 호출하면 된다.

        // 반환타입이 없는 경우
        //  - 선언 시 반환타입을 void로 정의하면 된다.
        //  - 호출 시 메서드만 호출하고 반환값을 받지않으면 된다.
        // String str = printHeader(); 반환 타입이 void이기 때문에 이렇게 반환값을 받으면 컴파일 오류가 발생한다.
        // 모든 메서드는 return을 호출해야 한다.
        //  - void인 경우 return을 생략가능, return을 만나면 프로그램 종료
    }

