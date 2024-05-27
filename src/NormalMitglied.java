public class NormalMitglied extends Mitglied{

    public NormalMitglied(String vorname, String nachname, int alter, Trainingseinheit[] trainings){
        super(vorname, nachname, alter, trainings);
    }

    public String mitgliedinfos() {
        String infos = "Name: " + vorname + " " + nachname + ", Alter: " + alter + "\nTrainingseinheiten: ";
        for (Trainingseinheit training : trainings) {
            if (training != null) {
                infos += "Geraet: " + training.getGeraet() + ", Datum: " + training.getDatum() + ", Startzeit: " + training.getStartzeit().toString() + ", Endzeit: " + training.getEndzeit().toString() + ", Kalorienverbrauch: " + training.getKalorienverbrauch() + "\n";
            }
        }
        return infos;
    }

}
