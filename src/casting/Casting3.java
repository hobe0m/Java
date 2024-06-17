package casting;

public class Casting3 {
    public static void main(String[] args) {
        // 형변환과 오버플로우
        //  - 형변환을 할 때 만약 작은 숫자가 표현할 수 있는 범위를 넘어서는 경우는 어떻게 될까

        long maxIntValue = 2147483647; // int의 최고값
        long maxIntOver = 2147483648L; // int의 최고값을 넘어서는 경우 컴파일 오류 발생, 따라서 더 큰 데이터 형에 넣어줘야 한다.
        int intValue = 0;

        intValue = (int) maxIntValue; // int로 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // int로 형변환
        System.out.println("maxIntOver casting = " + intValue);
        // -2147483648(int의 제일 작은 범위)로 출력된다.
        // 즉, 시계가 한 바퀴 도는 것처럼 제일 작은 범위부터 다시 시작한다.
        //  - 오버플로우의 결과

        // 만약 큰 범위의 데이터 타입이라도 안에 들어 있는 값이 작은 범위의 데이터 타입에 들어가는 경우에는 문제 없이 형변환(명시적)이 된다.
        // 중요한 건 오버플로우가 발생했다라는 것이 문제라는 것이다.
        // 따라서 계산을 하는데 시간 낭비를 하지 말고 그걸 막기 위해 형변환을 시켜줘야 한다.

    }
}
