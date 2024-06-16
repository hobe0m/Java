package cond;

public class GradeSwitchEx {
    public static void main(String[] args) {
        
        String grade = "B";

        /*
        기존의 case 문으로 학점에 따른 성취도 출력하기

        System.out.println("학점은 " + grade + "입니다.");
        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                break;
         */

        // 새로운 switch문으로 학점에 따른 성취도 출력하기

        System.out.println("학점은 " + grade + "입니다.");
        switch (grade) {
            case "A" -> System.out.println("탁월한 성과입니다!");
            case "B" -> System.out.println("좋은 성과입니다!");
            case "C" -> System.out.println("준수한 성과입니다!");
            case "D" -> System.out.println("향상이 필요합니다.");
            case "F" -> System.out.println("불합격입니다.");
            default -> System.out.println("잘못된 학점입니다.");
            }
        }
    }

