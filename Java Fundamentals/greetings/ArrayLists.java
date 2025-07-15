import java.util.ArrayList;
public final class ArrayLists {
    
    public static void main(String[] args){
        String[] words = {"it", "is", "this", "we", "do", "how"};
        ArrayList<String> phrase = new ArrayList<String>();
        // Pull words from the 'words' array to populate the 'phrase' array list
        // Print the 'phrase' array list
        // Expected output: [this, is, how, we, do, it]

        phrase.add(words[2]); // "this"
        phrase.add(words[1]); // "is"
        phrase.add(words[5]); // "how"
        phrase.add(words[3]); // "we"
        phrase.add(words[4]); // "do"
        phrase.add(words[0]); // "it"
        System.out.println(phrase);
    }
}

