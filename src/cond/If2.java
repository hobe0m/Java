package cond;

public class If2 {
    public static void main(String[] args) {

        int age = 17;

        if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
        
        // if문의 조건을 만족하면 else문은 무시, 만족하지 않으면 else문 실행
    }
}
