package OneTen;

public class Three {
    public static void main(String[] args){
//What is the largest prime factor of the number 600851475143 ?
//prime factory to liczba całkowita podzielna bez reszty oraz podzielna przez samą siebie.

        long a = 600851475143l;
        long max = 0;
        long temp = 0;

        for (long i = 1; i <= a; i++ )
        {
            if (a % i == 0)
            {
                a /= i;
                max = i;
                i = 1;
            }
        }
        System.out.println("Wynik to : " + max);
    }
}
