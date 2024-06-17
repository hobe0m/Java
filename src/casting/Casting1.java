package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 형변환(자동, 묵시적 형변환)
        // 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
        // 하지만 큰 범위에서 작은 범위로 넣을 때는 문제가 발생한다.
        //  - 소수점 버림
        //  - 오버플로우(숫자가 너무 큰 것을 작은 범위에 넣어 잘리는 등의 문제 발생)
        // int < long < double

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); // 명칭이 헷갈리지 않게 doubleValue2로 지정
        
        /*
        자동 형변환이 동작하는 원리
        intValue = 10;
        doubleValue = intValue; - double 타입에 int 타입 넣을 때
        doubleValue = (double) intValue; - int 타입의 값을 (double)을 통해 double 타입으로 변경 
        doubleValue = (double) 10; - 변수의 값 읽기
        doubleValue = 10.0 - 형변환 완료
        */
    }
}
