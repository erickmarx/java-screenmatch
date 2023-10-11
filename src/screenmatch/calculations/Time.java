package screenmatch.calculations;
import screenmatch.models.Title;

public class Time {
    private int total;
    
    public int getTotal() {
        return total;
    }
    
    public void include(Title title) {
        this.total += title.getLength();
    }
}
