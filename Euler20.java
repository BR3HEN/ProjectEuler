package ElevenTwenty;

import java.math.BigInteger;
//https://projecteuler.net/problem=20
public class Euler20 {
    // Zwrqaca silnie z n
    static BigInteger factorial(int n)
    {
        // Zadeklaruj wynik
        BigInteger result = new BigInteger("1");
        // oblicz silnie dla n
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));//wzór na silnie n = n * (n + 1)
        }
        return result;
    }

    public static void main(String[] args){
        String fractChain = String.valueOf(factorial(100));//zadeklaruj łańcuch znaków wynikiem 100!
        int lenght = fractChain.length();//weź długość znaków z fractChain
        int sum = 0;//zadeklaruj sume
        //pętla dodająco elementy do siebie z łańcucha znaków
        for (int i = 0; i < lenght; i++){
            int digit = Character.getNumericValue(fractChain.charAt(i));
            sum += digit;
        }
        System.out.println(sum);
    }
}
