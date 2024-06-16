package cond;

public class CondOp2 {
    public static void main(String[] args) {
        // 파일 선택 후 ctrl + c(복사), ctrl + v(붙여넣기)를 하면 같은 파일을 새로운 이름으로 만들 수 있다.
        // if문 없이 변수에 (조건) ? "참일 때 값" : "거짓일 때 값"; 을 출력할 수 있다.
        // 특정 조건에 따라 결과가 나오기 때문에 조건 연산자라고도 한다.
        // if문처럼 코드 블럭을 넣을 수 있는 것이 아니라 단순한 표현식만 넣을 수 있다.
        // if문으로 대체 가능(switch문도 마찬가지)

        int age = 7;
        String status = (age >= 18) ? "성인" : "미성년자";
        // status는 age가 18세보다 크거나 같으면 성인이고, 그렇지 않으면 미성년자이다.
        System.out.println("age = " + age + " status = " + status);


    }
}
