import java.util.*;

public class main {


    public static void main(String[] args){
        System.out.println(hexToDecimal(args[0]));
    }

    public static long hexToDecimal(String hexNumber){
        if(hexNumber.charAt(1) == 'x'){
            hexNumber = hexNumber.substring(2, hexNumber.length());
        }

        long newDecimalNum = 0;
        int totalHexPlaces = hexNumber.length();
        int currentHexPlace = hexNumber.length() - 1;

        for(int i = 0; i < hexNumber.length(); i++){
            if((int)hexNumber.charAt(i) > 57) {
                char lowerHexValue = Character.toLowerCase(hexNumber.charAt(i));
                newDecimalNum = newDecimalNum + (((int) lowerHexValue - 87) * (long)(Math.pow(16, currentHexPlace)));
            }
            else{
                newDecimalNum = newDecimalNum + (((int)hexNumber.charAt(i) - 48) * (long)(Math.pow(16, currentHexPlace)));
            }
            currentHexPlace--;
        }
        return newDecimalNum;
    }
}
