import java.time.LocalDate;
import java.time.LocalTime;

public class Trainingseinheit{
    private LocalDate datum;
    private LocalTime startzeit;
    private LocalTime endzeit;
    private String geraet;
    private int kalorienverbrauch;

    public Trainingseinheit(LocalDate datum, LocalTime startzeit, LocalTime endzeit, String geraet, int kalorienverbrauch){
        this.datum = datum;
        this.geraet = geraet;
        this.startzeit = startzeit;
        this.endzeit = endzeit;
        this.kalorienverbrauch = kalorienverbrauch;
    }

    public LocalDate getDatum(){
        return datum;
    }

    public void setDatum(LocalDate datum){
        this.datum = datum;
    }

    public LocalTime getStartzeit(){
        return startzeit;
    }

    public void setStartzeit(LocalTime startzeit){
        this.startzeit = startzeit;
    }

    public LocalTime getEndzeit(){
        return endzeit;
    }

    public void setEndzeit(LocalTime endzeit) {
        this.endzeit = endzeit;
    }

    public String getGeraet(){
        return geraet;
    }

    public void setGeraet(String geraet){
        this.geraet = geraet;
    }

    public int getKalorienverbrauch(){
        return kalorienverbrauch;
    }

    public void setKalorienverbrauch(int kalorienverbrauch){
        this.kalorienverbrauch = kalorienverbrauch;
    }


}