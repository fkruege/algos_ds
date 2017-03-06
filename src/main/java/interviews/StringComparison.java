package interviews;

/**
 * Created by fkruege on 2/17/2017.
 */
public class StringComparison {

    public static void main(String[] args) {

        String inputPassword = "Secret";
        String expectedPassword = "Secret";

        if(inputPassword == expectedPassword){
            System.out.println("You may enter");
        }

        if(inputPassword.equals(expectedPassword)){
            System.out.println("You may enter");
        }

    }


}
