package CodeChallenges;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.RandomSeq;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 3/5/17.
 */
public class GenerateWordSearch {

    private static final int WORD_SEARCH_SIZE = 500;

    private enum Direction {HORIZONTAL, VERTICAL}

    private enum WordType {
        VALID_WORD,
        GIBBERISH,
        METOVA_WORD;
    }


    public GenerateWordSearch() {

    }

    private char[][] getWordSearchPuzzle() {
        List<String>[] wordList = readWordList();
        List<String> validWords = getValidWords();
        char[][] wordsearch = createWordSearch();

        for (int i = 0; i < WORD_SEARCH_SIZE; i++) {
            WordType wordType = getWordType();
            String word = "";
            if (wordType == WordType.VALID_WORD) {

            } else if (wordType == WordType.GIBBERISH) {

            } else {

            }



        }

        return null;


    }

    private String gtValidWord(){
        return "";

    }

    private char[][] createWordSearch() {

        char[][] wordsearch = new char[WORD_SEARCH_SIZE][WORD_SEARCH_SIZE];
        for (int i = 0; i < WORD_SEARCH_SIZE; i++) {
            for (int j = 0; j < WORD_SEARCH_SIZE; j++) {
                wordsearch[i][j] = Character.MIN_VALUE;
            }
        }
        return wordsearch;
    }


    private List<String>[] readWordList() {
        List<String>[] wordList = (List<String>[]) new Object[25];
        String inputWordList = "src/test/resources/words.txt";
        In inputFile = new In(inputWordList);

        while (inputFile.hasNextLine()) {
            String word = inputFile.readLine().trim();
            int wordLength = word.length();

            if (wordList[wordLength] == null) {
                wordList[wordLength] = new ArrayList<String>();
            }

            wordList[wordLength].add(word);
        }

        return wordList;
    }

    private List<String> getValidWords() {
        List<String> validWords = new ArrayList<String>();
        validWords.add("METOVA");
        validWords.add("COURAGE");
        validWords.add("HONESTY");
        validWords.add("PASSION");
        validWords.add("CURIOSITY");

        return validWords;
    }

    private Direction getDirection() {
        int random = (int) (StdRandom.uniform() % 2);
        if (random == 0) {
            return Direction.HORIZONTAL;
        } else {
            return Direction.VERTICAL;
        }
    }

    private WordType getWordType() {
        int random = (int) (StdRandom.uniform() % 3);
        if (random == 0) {
            return WordType.VALID_WORD;
        } else if (random == 1) {
            return WordType.GIBBERISH;
        } else {
            return WordType.METOVA_WORD;
        }
    }
}
