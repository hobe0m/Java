package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }

        // While2_3과 동일한 코드지만 For2의 코드가 더 간결하다.
        // i(반복을 위해 값이 증가하는 변수)를 카운터 변수, 인덱스 변수 등으로 부른다.
        // for문에서는 반복 횟수에 영향을 주는 변수를 선언부터, 값 증가, 조건식에 활용까지 구조를 한 줄로 표현
        // 반복횟수가 정해져 있을 경우에는 for문을 쓰는게 더 간결하다.

        // for문에서 초기식, 조건식, 증감식은 모두 선택사항이라 생략이 가능하지만 구분하는 세미콜론(;)은 유지해주어야 한다.
        // 초기식, 조건식, 증감식을 모두 생략하면 무한루프[(while(true)와 동일]가 돈다.

    }

}
