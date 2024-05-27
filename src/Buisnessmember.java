public class Buisnessmember extends Mitglied{

    private String arbeitgeber;

    public Buisnessmember(String vorname, String nachname, int alter, Trainingseinheit[] trainings, String arbeitgeber) {
        super(vorname, nachname, alter, trainings);
        this.arbeitgeber = arbeitgeber;
    }


    public String mitgliedinfos() {
        String infos = "Name: " + vorname + " " + nachname + ", Alter: " + alter + ", Arbeitgeber: " + arbeitgeber + "\nTrainingseinheiten: ";
        for (Trainingseinheit training : trainings) {
            if (training != null) {
                infos += "Geraet: " + training.getGeraet() + ", Datum: " + training.getDatum() + ", Startzeit: " + training.getStartzeit().toString() + ", Endzeit: " + training.getEndzeit().toString() + ", Kalorienverbrauch: " + training.getKalorienverbrauch() + "\n";
            }
        }
        return infos;
    }

    public String getArbeitgeber() {
        return arbeitgeber;
    }

    public void setArbeitgeber(String arbeitgeber) {
        this.arbeitgeber = arbeitgeber;
    }
}
