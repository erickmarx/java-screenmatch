package screenmatch.calculations;
import screenmatch.interfaces.Classification;

public class FilterRecomendation {
    private String recomendation;
    
    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            this.recomendation = "Watch it!";
        } else {
            this.recomendation = "Don't watch it!";
        }
        
        System.out.println(recomendation);
    }
}
