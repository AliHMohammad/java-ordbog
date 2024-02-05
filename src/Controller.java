import java.io.File;
import java.util.*;

public class Controller {

    private List<Word> wordArr;
    private Set<OpslagsWord> opslagsWordSet;
    private Map<Integer, Word> opslagsWordMap;
    private Map<String, Integer> ordklasseStatistik;

    public Controller() {
        wordArr = new ArrayList<>();
        opslagsWordSet = new HashSet<>();
        opslagsWordMap = new HashMap<>();
        ordklasseStatistik = new HashMap<>();
    }

    public void readFile() {

        try {
            Scanner fileReader = new Scanner(new File("./ordbog.csv"));

            while (fileReader.hasNext()){
                String line = fileReader.nextLine();
                // System.out.println(line);
                wordArr.add(new Word(line));

            }

            System.out.println(wordArr.size() + " words read.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void saveUniqueWords() {
        for (Word word : wordArr) {
            OpslagsWord opslagsOrd = new OpslagsWord(word);

            opslagsWordSet.add(opslagsOrd);
        }

        System.out.println(opslagsWordSet.size() + " unique words.");


    }

    public void fillHashMap() {
        for (OpslagsWord uniqueWord : this.opslagsWordSet) {
            opslagsWordMap.put(uniqueWord.getId(), uniqueWord);
        }
    }

    public void populateOrdklasseStatistik() {
        for (OpslagsWord uniqueWord : this.opslagsWordSet) {
            String partOfSpeech = uniqueWord.getPartOfSpeech();

            try {
                ordklasseStatistik.put(partOfSpeech, ordklasseStatistik.get(partOfSpeech) + 1);
            } catch (Exception e) {
                ordklasseStatistik.put(partOfSpeech, 1);
            }
        }
    }


    public List<Word> getWordArr() {
        return wordArr;
    }

    public Set<OpslagsWord> getOpslagsWordSet() {
        return opslagsWordSet;
    }

    public Map<Integer, Word> getOpslagsWordMap() {
        return opslagsWordMap;
    }

    public Map<String, Integer> getOrdklasseStatistik() {
        return ordklasseStatistik;
    }
}
