import java.util.*;

public class OpslagsWord extends Word {

    private Set<String> listOfForms;

    public OpslagsWord(Word word) {
        super(word);

        this.listOfForms = new HashSet<>();
        this.listOfForms.add(word.getForm());
    }

    public void addForm(String form) {
        this.listOfForms.add(form);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return getId() == word.getId() && Objects.equals(getHead(), word.getHead());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHead(), getId());
    }

    @Override
    public String toString() {
        return "Word{" +
                "form='" + getForm() + '\'' +
                ", head='" + getHead() + '\'' +
                ", homographNumber=" + getHomographNumber() +
                ", partOfSpeech='" + getPartOfSpeech() + '\'' +
                ", id=" + getId() + '\'' +
                ", listOfForms=" + listOfForms +
                '}';
    }
}
