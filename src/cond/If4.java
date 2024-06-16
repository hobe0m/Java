package cond;

public class If4 {
    public static void main(String[] args) {
        
        // else if문 : if문의 조건이 거짓일 때 다음 조건을 검사한다 즉, 앞선 if문이 참이라면 else if문을 실행하지 않는다.
        //  - else if문은 앞의 if문 혹은 else if문의 조건들을 적용한 상태로 다음 조건을 검사한다.
        // else if문을 사용하여 불필요한 조건 검사를 피하고 코드의 효율성을 높일 수 있다.
        
        int age = 7;

        if (age <= 7) {
            System.out.println("미취학 아동입니다.");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생입니다.");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생입니다.");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생입니다.");
        } else {
            System.out.println("성인입니다.");
        }
        
        // if문에서 2가지 조건을 사용할 경우 %%, ||, ! 등 사용
        // 참고로 else는 생략할 수 있다.
        // if문만 있어도 되고 else if까지만 있어도 된다.
    }
}
