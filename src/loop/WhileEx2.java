package loop;

public class WhileEx2 {
    public static void main(String[] args) {

        // 하나의 숫자만으로는 반복할 수 없기에 count를 반복횟수로 지정
        // 1 ~ 10의 반복만큼 = 처음 10개의 짝수
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num +=2;
            count++;
        }
    }
}
