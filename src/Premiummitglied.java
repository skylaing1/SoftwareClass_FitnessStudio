public class Premiummitglied extends Mitglied {
    private String lieblingsgetraenk;

    private int parkplatznummer;

    private String personaltrainer;

    public Premiummitglied(String vorname, String nachname, int alter, Trainingseinheit[] trainings, String lieblingsgetraenk, int parkplatznummer, String personaltrainer) {
        super(vorname, nachname, alter, trainings);
        this.lieblingsgetraenk = lieblingsgetraenk;
        this.parkplatznummer = parkplatznummer;
        this.personaltrainer = personaltrainer;
    }

    public String mitgliedinfos() {
        String infos = "Name: " + vorname + " " + nachname + ", Alter: " + alter + ", Lieblingsgetraenk: " + lieblingsgetraenk + ", Parkplatznummer: " + parkplatznummer + ", Personaltrainer: " + personaltrainer + "\nTrainingseinheiten: ";
        for (Trainingseinheit training : trainings) {
            if (training != null) {
                infos += "Geraet: " + training.getGeraet() + ", Datum: " + training.getDatum() + ", Startzeit: " + training.getStartzeit().toString() + ", Endzeit: " + training.getEndzeit().toString() + ", Kalorienverbrauch: " + training.getKalorienverbrauch() + "\n";
            }
        }
        return infos;
    }

    public void setLieblingsgetraenk(String lieblingsgetraenk) {
        this.lieblingsgetraenk = lieblingsgetraenk;
    }

    public void setPersonaltrainer(String personaltrainer) {
        this.personaltrainer = personaltrainer;
    }

    public void setParkplatznummer(int parkplatznummer) {
        this.parkplatznummer = parkplatznummer;
    }

    public String getPersonaltrainer() {
        return personaltrainer;
    }

    public int getParkplatznummer() {
        return parkplatznummer;
    }

    public String getLieblingsgetraenk() {
        return lieblingsgetraenk;
    }
}
