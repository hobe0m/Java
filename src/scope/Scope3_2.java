package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        // temp의 스코프 좁히기(if절 안에 선언 및 초기화)
        // ctrl + n : 네비게이션, 파일 위치 검색 기능
        // ctrl + e : 기존에 사용했던 파일들(class들)을 보여준다.
        // ctrl + e + enter : 바로 전에 작업했던 파일(class)로 이동한다.

        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
    
    // 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다.
    // 메모리를 효율적으로 사용하고 유지보수하기 편하기 때문이다.
    // 좋은 프로그램은 무한한 자유가 있는 것이 아닌 적절한 제약이 있는 프로그램이다.
}
