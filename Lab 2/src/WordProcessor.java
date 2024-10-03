public class WordProcessor implements Counter {


    /*
     * Takes a specified string (sentence)
     *
     * Creates a string array (words) by using variables separated by a space (" ")
     *
     * counts and returns the length of the array (words)
     */
    public int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;

    }

    public int countLetters(String sentence) {
        /*for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                return i;
            }
        }*/
        return 0;
    }

    public int getLength(String sentence) {
        return sentence.length();
    }
}
