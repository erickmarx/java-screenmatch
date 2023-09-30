public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Titanic";
        movie.releaseDate = 1997;
        movie.inPlan = true;
        movie.finalRating = 7.8;
        movie.totalRating = 7.8;
        movie.reviews = 1;
        movie.length = 210;
        
        movie.rate(8.5);
    }
}
