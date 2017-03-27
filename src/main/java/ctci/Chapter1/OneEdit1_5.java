package ctci.Chapter1;

/**
 * Created by fkruege on 3/25/17.
 */
public class OneEdit1_5 {

    public boolean isOneEdit(String a, String b) {
        int[] charMap = new int[26];

        for(int i = 0; i < a.length(); i++){
            char aChar = a.charAt(i);
            int numericValue = getNumericValue(aChar);
            int existingCount = charMap[numericValue];
            charMap[numericValue] = ++existingCount;
        }


        int differenceCount = 0;

        for(int i = 0; i < b.length(); i++){
            char bChar = b.charAt(i);
            int numericValue = getNumericValue(bChar);
            int existingCount = charMap[numericValue];
            if(existingCount == 0){
                differenceCount++;
            }else{
                charMap[numericValue] = --existingCount;
            }

            if(differenceCount >= 2){
                return false;
            }
        }

        return true;

    }

    private int getNumericValue(char c) {
        int aNumeric = Character.getNumericValue('a');
        int cNumeric = Character.getNumericValue(c);
        return cNumeric - aNumeric;
    }


}
