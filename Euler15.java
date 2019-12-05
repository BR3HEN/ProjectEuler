package ElevenTwenty;

import java.math.BigInteger;

public class Euler15 {
    public static BigInteger factorial(int n){

        BigInteger factorial = new BigInteger(String.valueOf(n));
        for (int i = n - 1; i >= 1; i--){
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial;
    }
    public static void main(String[] args){
        int numOfMove = 40;
        int numOfMoveToTheRight = 20;
        int sub = numOfMove - numOfMoveToTheRight;

        System.out.println(factorial(numOfMove).divide(factorial(numOfMoveToTheRight).multiply(factorial(sub))));
    }
}
