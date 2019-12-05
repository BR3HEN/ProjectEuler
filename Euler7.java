package OneTen;

public class Euler7 {

    public static long nOPrime(long x)
    {
        int numOfPrim = 0;
        long prime = 1;

        while (numOfPrim < x){
            prime++;
            if (primeNumb(prime)){
                numOfPrim++;
            }
        }
        return prime;
    }

    public static boolean primeNumb(long a)
    {
        for (int n = 2; n < a; n++)
        {
            if (a % n == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Program wylicza indeks liczby pierwszej o wartości 271");
        int counter = 0;
        for (int a = 2; a <= 271 ; a++)
        {
            if (primeNumb(a) == true) {
                counter++;
            }
        }
        System.out.println("Liczba pierwsza o wartości 271 znajduje się na pozycji " + counter);

        System.out.println("\nProgram wylicza wartość liczby pierwszej o indeksie 10 001:");
        System.out.println("Wartość liczby pierwszej na pozycji 10 001 to " + nOPrime(10001));


    }
}
