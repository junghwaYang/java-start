package classStudy.Q;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "영화 리뷰";


        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "영화 리뷰";

        MovieReview[] movieReviews = new MovieReview[]{aboutTime, inception};

        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + " " + movieReview.review);
        }
    }
}
