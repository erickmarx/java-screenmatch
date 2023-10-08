package screenmatch.models;
public class Serie extends Title {
    private boolean isActive;
    private int episodes;
    private int temps;
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setActive(boolean active) {
        isActive = active;
    }
    
    public int getEpisodes() {
        return episodes;
    }
    
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    
    public int getTemps() {
        return temps;
    }
    
    public void setTemps(int temps) {
        this.temps = temps;
    }
    
    @Override
    public int getLength() {
        return temps * episodes * length;
    }
}
