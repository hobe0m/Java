package cond;

public class ScoreEx {
    public static void main(String[] args) {

        int score = 72;
        String grade;

        if (score >= 90) {
            grade = "A";
            System.out.println("학점은 " + grade + "입니다.");
        } else if (score >= 80 && score < 90) {
            grade = "B";
            System.out.println("학점은 " + grade + "입니다.");
        }  else if (score >= 70 && score < 80) {
            grade = "C";
            System.out.println("학점은 " + grade + "입니다.");
        } else if (score >= 60 && score < 70) {
            grade = "D";
            System.out.println("학점은 " + grade + "입니다.");
        } else {
            grade = "F";
            System.out.println("학점은 " + grade + "입니다.");
        }
    }
}
