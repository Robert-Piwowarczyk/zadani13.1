import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompetitionResults {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String outFileName = "stats_out.csv";
        List<Person> persons = new ArrayList<>();

        while (true) {
            System.out.println("Podaj wynik kolejnego gracza (stop):");
            String p = sc.nextLine();
            if (p.equals("stop")) {
                break;
            }
            String[] userParts = p.split(" ");
            Person newPerson = new Person(userParts[0], userParts[1], Integer.parseInt(userParts[2]));
            persons.add(newPerson);
        }
        System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
    }
}







