import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
    ArrayList<String> list = new ArrayList<>();


    public void enterList() throws FileNotFoundException {

        String PATH = "C:\\Users\\rodi4\\IdeaProjects\\wordList\\out\\production\\wordList\\word.txt";

        File file = new File(PATH);
        Scanner scanner = new Scanner(file);


        while (scanner.hasNext()) {

            list.add(scanner.next());
            // System.out.println(scanner.next());
        }
        scanner.close();
    }

    public void letterEnter() throws FileNotFoundException {
        enterList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву");
        String letter = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) == letter.charAt(0)) {
                System.out.println(list.get(i));
                counter++;
            }
        }
        if (counter == 0) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите слово");

            String word = scanner1.next();
            list.add(word);
            System.out.println(list);
        }
    }
}
