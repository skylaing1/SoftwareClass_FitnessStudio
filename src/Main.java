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

        mitglieder[1] = new Premiummitglied("Erika", "Musterfrau", 25, erikaTrainings, "Wasser", 1, "Hans");

        System.out.println(mitglieder[0].mitgliedinfos());
        System.out.println(mitglieder[1].mitgliedinfos());

    }

}