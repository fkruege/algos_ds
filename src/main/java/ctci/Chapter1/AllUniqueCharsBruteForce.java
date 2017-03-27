package ctci.Chapter1;

/**
 * Created by fkruege on 3/24/17.
 */
public class AllUniqueCharsBruteForce {

    boolean IsAllUniqueChars(String input){
        for(int i = 0; i < input.length(); i++){
            char iChar = input.charAt(i);
            for(int j = i+1; j < input.length(); j++){
                char jChar = input.charAt(j);
                if(iChar == jChar){
                   return false;
                }
            }
        }
        return true;
    }
}
