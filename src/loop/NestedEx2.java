package loop;

public class NestedEx2 {
    public static void main(String[] args) {
       int rows = 10;

       System.out.println("rows = " + rows);

       // 행의 반복 횟수
       for (int i = 1; i <= 10; i++) {
           
           // 별의 반복 횟수(첫 번째 줄은 하나, 두 번째 줄은 두 개...)
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           // 별이 한 줄에 다 찍히지 않고, 피라미드 형식으로 찍히게끔 띄어쓰기 활용
           System.out.println();
       }
    }

    // for문은 복잡한 조건보다 간단한 조건일 때 사용하고, 복잡한 조건은 while문을 활용한다.
    // 종료 시점을 알 때 : for문, 종료 시점을 모를 때 : while문
    // 중첩 반복문은 웬만하면 2번 이상 사용하지 않는다.
}
