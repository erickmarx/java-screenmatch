//@formatter:on

public class Movie {
    String name;
    int releaseDate;
    boolean inPlan;
    double finalRating;
    double totalRating;
    int reviews;
    int length;
    
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("In Plan: " + inPlan);
        System.out.println("Final Rating: " + finalRating);
        System.out.println("Total Rating: " + totalRating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Length: " + length);
    }
    
    void rate(double rate) {
        this.reviews++;
        this.totalRating += rate;
        this.finalRating = this.totalRating / this.reviews;
    }
}
