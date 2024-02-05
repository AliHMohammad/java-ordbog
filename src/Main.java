import java.io.File;
import java.util.*;

public class Main {



    public static void main(String[] args) {
        Controller app = new Controller();
        app.readFile();
        app.saveUniqueWords();
        app.fillHashMap();
        app.populateOrdklasseStatistik();

        //System.out.println(app.getOpslagsWordSet());
        System.out.println(app.getWordArr().get(10000));
        System.out.println(app.getOpslagsWordMap().get(52000090));
        System.out.println(app.getOrdklasseStatistik());
    }





    //Opgave 3. Brug hashMap med type Map
    //Opgave 4. Key-value pair (HashMap) Key er sb,adj osv og value er antal.
    //Hvis du støder på den inkrementer du value med 1. Eksisterer keyen ikke, tilføjes den med value 1.
}
