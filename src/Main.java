import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Trainingseinheit schulter = new Trainingseinheit(LocalDate.of(2021, 5, 1), LocalTime.of(10, 0), LocalTime.of(11, 0), "Schulterdrücken", 200);
        Trainingseinheit brust = new Trainingseinheit(LocalDate.of(2021, 5, 1), LocalTime.of(11, 0), LocalTime.of(12, 0), "Bankdrücken", 300);
        Trainingseinheit beine = new Trainingseinheit(LocalDate.of(2021, 5, 1), LocalTime.of(12, 0), LocalTime.of(13, 0), "Kniebeugen", 400);
        Trainingseinheit ruecken = new Trainingseinheit(LocalDate.of(2021, 5, 1), LocalTime.of(13, 0), LocalTime.of(14, 0), "Klimmzüge", 250);
        Trainingseinheit bauch = new Trainingseinheit(LocalDate.of(2021, 5, 1), LocalTime.of(14, 0), LocalTime.of(15, 0), "Planks", 150);
        Trainingseinheit arme = new Trainingseinheit(LocalDate.of(2021, 5, 1), LocalTime.of(15, 0), LocalTime.of(16, 0), "Bizepscurls", 200);
        Trainingseinheit cardio = new Trainingseinheit(LocalDate.of(2021, 5, 1), LocalTime.of(16, 0), LocalTime.of(17, 0), "Laufen", 500);

        Trainingseinheit[] maxTrainings = {brust,arme,ruecken};
        Trainingseinheit[] erikaTrainings = {schulter,beine,bauch};
        Trainingseinheit[] hansTrainings = {brust,beine,cardio};
        Trainingseinheit[] klausTrainings = {schulter,beine,cardio};


        Mitglied[] mitglieder = new Mitglied[100];

        mitglieder[0] = new Mitglied("Max", "Mustermann", 17, maxTrainings);


        mitglieder[1] = new Mitglied("Erika", "Musterfrau", 30, erikaTrainings);
        mitglieder[2] = new Mitglied("Hans", "Peter", 40, hansTrainings);
        mitglieder[3] = new Mitglied("Klaus", "Müller", 50, klausTrainings);
        mitglieder[4] = new Mitglied("Peter", "Schmidt", 16, maxTrainings);

        mitglieder[0].setPremium(true);
        mitglieder[1].setPremium(false);
        mitglieder[2].setPremium(true);
        mitglieder[3].setPremium(false);
        mitglieder[4].setPremium(true);

        System.out.println("\r\n");
        System.out.println("Aufgabe 3A");
        for (Mitglied mitglied : mitglieder) {
            if (mitglied != null) {
                if (mitglied.getAlter() > 18) {
                    //Gebe Mitglieder in Konsole aus
                    System.out.println(mitglied.getVorname() + " " + mitglied.getNachname() + " ist über 18 Jahre alt" + "  Alter: " + mitglied.getAlter());
                }
            }
        }

        System.out.println("\r\n");
        System.out.println("Aufgabe 3B");
        for (Mitglied mitglied : mitglieder) {
            if (mitglied != null) {
                if (mitglied.getPremium()) {
                    //Gebe Mitglieder in Konsole aus
                    System.out.println(mitglied.getVorname() + " " + mitglied.getNachname() + " ist Premiummitglied");
                }
            }
        }

        System.out.println("\r\n");
        System.out.println("Aufgabe 3C");
        for (Mitglied mitglied : mitglieder) {
            if (mitglied != null) {
                int avgCalorie = 0;
                int counter = 0;
                Trainingseinheit[] trainings = mitglied.getTrainings();
                for (Trainingseinheit training : trainings) {
                    if (training != null) {
                        avgCalorie += training.getKalorienverbrauch();
                        counter++;
                    }
                }
                if (avgCalorie != 0) {
                    avgCalorie = avgCalorie / counter;
                    System.out.println(mitglied.getVorname() + " " + mitglied.getNachname() + " hat durchschnittlich " + avgCalorie + " Kalorien verbrannt");
                }
            }
        }
    }

}