import screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("Titanic");
        movie.setReleaseDate(1997);
        movie.setInPlan(true);
        movie.setLength(210);
        movie.rate(7.8);
    }
}
