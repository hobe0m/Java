package cond;

public class If3 {
    public static void main(String[] args) {
        // if문의 사용
        // 중복 코드 검사와 코드 효율성이 떨어진다는 단점이 존재
        int age = 14;
        
        if(age <= 7) {
            System.out.println("미취학 아동입니다.");
        }

        if(age >= 8 && age <= 13) {
            System.out.println("초등학생입니다.");
        }

        if(age >= 14 && age <= 16) {
            System.out.println("중학생입니다.");
        }

        if(age >= 17 && age <= 19) {
            System.out.println("고등학생입니다.");
        }

        if(age >= 20) {
            System.out.println("성인입니다.");
        }
    }
}
