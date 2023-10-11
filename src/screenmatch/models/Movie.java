package screenmatch.models;

import screenmatch.interfaces.Classification;

public class Movie extends Title implements Classification {
    private String director;
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    @Override
    public int getClassification() {
        return (int) this.getFinalRating() / 2;
    }
}
