package OneTen;

public class Two {
    public static void main(String[] arg){

        long result = sumEvenFiboNumbers(4000000);
        System.out.println("Wynik sumy liczb parzystych ciągu to " + result);

    }

    static long sumEvenFiboNumbers(long n){
        long a = 0;
        long b = 1;
        long c = a + b;
        long sum = 0;
        long lastFibboNumber = 0;
        while (c < n){
            if(c % 2 == 0){
                sum += c;
            }
            a = b;
            b = c;
            c = a + b;
            if (c < n) lastFibboNumber = c;
        }
        System.out.println("Ostatnia liczba parzysta w ciągu to " + lastFibboNumber);
        return sum;
    }
}
