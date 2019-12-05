package ElevenTwenty;

import java.math.BigInteger;

public class Euler16 {
    public static void main(String[] args){

        BigInteger base = new BigInteger(String.valueOf(2));
        BigInteger veryBigNumber = base.pow(1000);
        System.out.println(veryBigNumber);
        String stringBigNumber = String.valueOf(veryBigNumber);

        int lenght = stringBigNumber.length();
        int sum = 0;

        for (int i = 0; i < lenght; i++){
            int digit = Character.getNumericValue(stringBigNumber.charAt(i));
            sum += digit;
        }
        System.out.println(sum);
    }
}
