package loop;

public class NestedEx1 {
    public static void main(String[] args) {

        int count = 1;

        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 9; j++) {
                System.out.println(count + "단 : " + count + " * " + j + " = " + (count * j));
            }
            count++;
        }
    }
}
