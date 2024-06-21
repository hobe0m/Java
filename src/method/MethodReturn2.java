package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        ageCheck(10);
        ageCheck(20);
        ageCheck(30);
    }

    // 만약 반환 타입을 지정하면 그 타입으로 return값이 나와야 한다.
    public static void ageCheck(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // 생략 가능
        }
        /*
        이 부분은 생략하고
        else {
            System.out.println(age + "살, 입장하세요.");
            return;
        }
        */
        System.out.println(age + "살, 입장하세요."); //  이것만 써줘도 된다.
    }
}
