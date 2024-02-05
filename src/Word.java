import java.util.Objects;

public class Word {

    private String form;
    private String head;
    private int homographNumber;
    private String partOfSpeech;
    private int id;

    public Word(String line) {
        String[] parts = line.split("\t");
        setForm(parts[0]);
        setHead(parts[1]);
        setHomographNumber(parts[2]);
        setPartOfSpeech(parts[3]);
        setId(parts[4]);
    }

    public Word(Word otherWord) {
        this.form = otherWord.form;
        this.head = otherWord.head;
        this.homographNumber = otherWord.homographNumber;
        this.partOfSpeech = otherWord.partOfSpeech;
        this.id = otherWord.id;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getHomographNumber() {
        return homographNumber;
    }

    public void setHomographNumber(int homographNumber) {
        this.homographNumber = homographNumber;
    }

    public void setHomographNumber(String homoNumber) {
        try {
            setHomographNumber(Integer.parseInt(homoNumber));
        } catch (Exception e) {
            setHomographNumber(0);
        }
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(String id) {
        setId(Integer.parseInt(id));
    }

    @Override
    public String toString() {
        return "Word{" +
                "form='" + form + '\'' +
                ", head='" + head + '\'' +
                ", homographNumber=" + homographNumber +
                ", partOfSpeech='" + partOfSpeech + '\'' +
                ", id=" + id +
                '}';
    }
}
