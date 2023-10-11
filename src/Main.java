import screenmatch.calculations.FilterRecomendation;
import screenmatch.models.Episode;
import screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        //        Movie movie = new Movie();
        //        movie.setName("Titanic");
        //        movie.setReleaseDate(1997);
        //        movie.setInPlan(true);
        //        movie.setLength(210);
        //        movie.rate(7.8);
        
        Serie serie = new Serie();
        serie.setName("Game of Thrones");
        serie.setReleaseDate(2011);
        serie.setInPlan(true);
        serie.setLength(60);
        serie.rate(9.3);
        
        //        Time time = new Time();
        //        time.include(movie);
        //        time.include(serie);
        //        System.out.println(time.getTotal());
        
        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(serie);
        episode.setName("episodio 1");
        episode.setTotalViews(300);
        
        FilterRecomendation filter = new FilterRecomendation();
        filter.filter(episode);
    }
}
