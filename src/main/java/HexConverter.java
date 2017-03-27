/**
 * Created by fkruege on 3/7/17.
 */
public class HexConverter {

    public String hexToString(int [] intHexArray) {
        //increment by two since the hex is split by two positions
        StringBuilder check = new StringBuilder();
        for (int hex : intHexArray) {
            String hexString = Integer.toString(hex);
            check.append(hexString);
        }
        StringBuilder string = new StringBuilder();
        for (int i=0; i<check.toString().toCharArray().length-1; i+=2) {
            String test = check.toString().substring(i, (i+2));
            int decimal = Integer.parseInt(test, 16);
            string.append((char) decimal);
        }
        return string.toString();
    }


    public String hexToString2(int [] intHexArray) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < intHexArray.length; i++){
            sb.append((char)intHexArray[i]);
        }
       return sb.toString();
    }


}
