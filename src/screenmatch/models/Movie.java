package screenmatch.models;//@formatter:on
public class Movie {
    private String name;
    private int releaseDate;
    private boolean inPlan;
    private double finalRating;
    private double totalRating;
    private int reviews;
    private int length;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getReleaseDate() {
        return releaseDate;
    }
    
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public boolean getInPlan() {
        return inPlan;
    }
    
    public void setInPlan(boolean inPlan) {
        this.inPlan = inPlan;
    }
    
    public double getTotalRating() {
        return totalRating;
    }
    
    public int getReviews() {
        return reviews;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public double getFinalRating() {
        return this.finalRating;
    }
    
    public void rate(double rate) {
        this.reviews++;
        this.totalRating += rate;
        this.finalRating = this.totalRating / this.reviews;
    }
}
