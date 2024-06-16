package cond;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 9;
        
        // 평점이 7점 이상인 영화 추천
        if (rating >= 7 && rating < 8) {
            System.out.println("평점 : " + rating);
            System.out.println("고질라를 추천합니다.");
            System.out.println("토이 스토리를 추천합니다");
            System.out.println("어바웃 타임을 추천합니다");
        // 평점이 8점 이상인 영화 추천
        } else if (rating >= 8 && rating < 9) {
            System.out.println("평점 : " + rating);
            System.out.println("토이 스토리를 추천합니다");
            System.out.println("어바웃 타임을 추천합니다");
        // 평점이 9점 이상인 영화 추천
        } else if (rating >= 9) {
            System.out.println("평점 : " + rating);
            System.out.println("어바웃 타임을 추천합니다.");
        }

        System.out.println("평점 " + rating + "에 따른 추천 영화입니다.");
    }
}
