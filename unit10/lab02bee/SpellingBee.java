import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class SpellingBee {

    private char[] letters;
    private char mustUse;

    public SpellingBee(char[] letters, char mustUse) {
        this.letters = letters;
        this.mustUse = mustUse;
    }

    public boolean checkWord(String word) {
        boolean rightLetter = true;

        if (word.length() > 3) {
            int i = 0;
            while (i != word.length() && rightLetter == true) {
                rightLetter = false;
                for (int j = 0; j < letters.length; j++) {
                    if (word.charAt(i) == letters[j]) {
                        rightLetter = true;
                    }
                }

                i++;
            }
            if (i == word.length() && rightLetter == true) {
                return true;
            } else {
                return false;
            }
        }

        else {
            return false;
        }
    }

    /**
     * Loads the contents of file "filename" as a String.
     * 
     * @param filename the file to load
     * @return the contents of file "filename"
     */
    public static String loadFile(String filename) {
        String contents = "";
        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());
            contents = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return contents;
    }

    public static void main(String[] args) {
        String[] words = loadFile("words_dropped.txt").split("\n");
        System.out.println("Loaded " + words.length + " words");
        // TODO solve me!
        SpellingBee bee = new SpellingBee("ranglty".toCharArray(), 'y');
        for (int i = 0; i < words.length; i++) {
            if (bee.checkWord(words[i])) {
                System.out.println(words[i]);
            }
        }

        // TODO sort words!
        Arrays.sort(words);

        // TODO what position in the sorted list is the word "search" ?
        for (int j = 0; j < words.length; j++) {
            if (words[j].equals("search")) {
                System.out.println(j);
            }
        }

    }
}
