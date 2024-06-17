package loop;

public class While1_1 {
    public static void main(String[] args) {
        // 반복문 : 특정 코드를 반복해서 실행할 때 사용한다.
        // while, do-while, for 총 3가지 반복문이 존재한다.
        // 반복문 또한 while로 다 만들 수 있으나 do-while이나 for는 특정 상황에 더 편리하다.
        
        int count = 0;

        count = count + 1; // ++count;로 치환 가능
        System.out.println("현재 숫자는 : " + count);
        count = count + 1; // ++count;로 치환 가능
        System.out.println("현재 숫자는 : " + count);
        count = count + 1; // ++count;로 치환 가능
        System.out.println("현재 숫자는 : " + count);
    }
}
