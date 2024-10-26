import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithFile {
public static void readFromFile() throws FileNotFoundException {
    File file = new File("D:\\AQA\\pypsik\\HelloWorld1\\ILoveJaba.txt");
    Scanner scanner = new Scanner(file);
        ArrayList<String> fileContext = new ArrayList<>();
        while (scanner.hasNext()){
            fileContext.add(scanner.nextLine());
        }
        fileContext.forEach(System.out::println);

}
}
