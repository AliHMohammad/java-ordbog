import java.io.File;
import java.util.*;

public class Main {

    private List<Word> wordArr;
    private Set<OpslagsWord> opslagsWordSet;

    public static void main(String[] args) {
        Main app = new Main();
        app.readFile();
    }

    public Main() {
        wordArr = new ArrayList<>();
        opslagsWordSet = new HashSet<>();
    }

    public void readFile() {

        try {
            Scanner fileReader = new Scanner(new File("./ordbog.csv"));

            while (fileReader.hasNext()){
                String line = fileReader.nextLine();
                System.out.println(line);
                wordArr.add(new Word(line));

            }
            System.out.println(wordArr.size() + " words read.");

            for (Word word : wordArr) {
                OpslagsWord opslagsOrd = new OpslagsWord(word);



                opslagsWordSet.add(opslagsOrd);
            }

            System.out.println(opslagsWordSet.size() + " unique words.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Opgave 3. Brug hashMap med type Map
    //Opgave 4. Key-value pair (HashMap) Key er sb,adj osv og value er antal.
    //Hvis du støder på den inkrementer du value med 1. Eksisterer keyen ikke, tilføjes den med value 1.
}
