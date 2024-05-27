public abstract class Mitglied{
    protected String vorname;
    protected String nachname;
    protected int alter;
    protected Trainingseinheit[] trainings = new Trainingseinheit[100];

    public Mitglied(String vorname, String nachname, int alter, Trainingseinheit[] trainings){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.trainings = trainings;
    }

    public abstract String mitgliedinfos();

    public String getVorname(){
        return vorname;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public Trainingseinheit[] getTrainings(){
        return trainings;
    }

    public void setTrainings(Trainingseinheit[] trainings){
        this.trainings = trainings;
    }

    public int getAlter(){
        return alter;
    }

    public void setAlter(int alter){
        this.alter = alter;
    }


}