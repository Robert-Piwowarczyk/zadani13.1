import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Result {
    static void saveResult(List<Person> results, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Person result : results) {
            if (result != null) {
                writer.write(result.toString());
                writer.newLine();
            }
        }
        writer.close();
    }
}
