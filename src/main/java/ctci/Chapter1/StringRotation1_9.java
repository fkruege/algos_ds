package ctci.Chapter1;

/**
 * Created by fkruege on 3/29/17.
 */
public class StringRotation1_9 {

    // word = duck
    // rotatedWord = ckdu
    // ckduckdu
    public boolean isRotation(String word, String rotatedWord){
        if(word.length() != rotatedWord.length()){
            return false;
        }

        String word_word = word + word;
        return isSubstring(word_word, rotatedWord);
    }

    private boolean isSubstring(String main, String sub){
        return main.indexOf(sub) >= 0;
    }
}
