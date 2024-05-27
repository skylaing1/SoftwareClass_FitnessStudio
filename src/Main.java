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

        Trainingseinheit[] maxTrainings = {brust, arme, ruecken};
        Trainingseinheit[] erikaTrainings = {schulter, beine, bauch};
        Trainingseinheit[] hansTrainings = {brust, beine, cardio};
        Trainingseinheit[] klausTrainings = {schulter, beine, cardio};


        Mitglied[] mitglieder = new Mitglied[100];

        // Aufgabe 2

        //3 Premium und 3 Buisness

        mitglieder[0] = new Premiummitglied("Max", "Mustermann", 30, maxTrainings, "Wasser", 1, "Hans");
        mitglieder[1] = new Premiummitglied("Erika", "Musterfrau", 25, erikaTrainings, "Tee", 2, "Klaus");
        mitglieder[2] = new Premiummitglied("Hans", "Muster", 35, hansTrainings, "Kaffee", 3, "Max");
        mitglieder[3] = new Buisnessmember("Klaus", "Muster", 40, klausTrainings, "Kaufland");
        mitglieder[4] = new Buisnessmember("Erika", "Musterfrau", 25, erikaTrainings, "Epic Games");
        mitglieder[5] = new Buisnessmember("Hans", "Muster", 35, hansTrainings, "Valve");

        System.out.println(mitglieder[0].mitgliedinfos());
        System.out.println(mitglieder[1].mitgliedinfos());
        System.out.println(mitglieder[2].mitgliedinfos());
        System.out.println(mitglieder[3].mitgliedinfos());
        System.out.println(mitglieder[4].mitgliedinfos());
        System.out.println(mitglieder[5].mitgliedinfos());


        // Aufgabe 3A
        /* Die Klasse Mitglied sollte zu einer Abstrakten klasse umgewandelt werden
         weil die Klasse Normalbürger den Konstruktor des Mitglieds ersetzt
         desweiteren kann mitgliedinfos eine abstrakte methode sein weil sie in jeder Sub Class implementiert wird
         */

        //Aufgabe 3B

        mitglieder[6] = new NormalMitglied("Hans", "Muster", 35, hansTrainings);

        System.out.println(mitglieder[6].mitgliedinfos());

    }
}