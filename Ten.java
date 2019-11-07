package OneTen;
//Find the sum of all the primes below two million.
public class Ten {
    public static boolean primeNumb(long a)//Czy to jest liczba pierwsza?
    {
        var sqrt = (int)Math.sqrt(a);//var dla Java 10+

        for (long n = sqrt; n > 1; n--) {//<----- check
            if (a % n == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){

        long sumOfPrime = 0;
        for (long a = 2000000; a > 1 ; a--)//z zakresu 2 mln
        {
            if (primeNumb(a))
                sumOfPrime += a;//sumuj liczby pierwsze
        }//a

        System.out.println("Wynik to " + sumOfPrime);
    }
}
