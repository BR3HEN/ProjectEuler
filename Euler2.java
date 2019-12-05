package OneTen;
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class Euler2 {
    public static void main(String[] arg){

        long result = sumEvenFiboNumbers(4000000);//wywołaj metodę
        System.out.println("Wynik sumy liczb parzystych ciągu to " + result);

    }

    static long sumEvenFiboNumbers(long n){
        //zmienne początkowe
        long a = 0;
        long b = 1;
        long c = a + b;
        long sum = 0;
        long lastFibboNumber = 0;
        
        while (c < n){
            if(c % 2 == 0){//sprawdź czy parzysta liczba 
                sum += c;//jeśli true to dodaj do sumy końcowej
            }
            //następne liczby ciągu fibonacciego
            a = b;
            b = c;
            c = a + b;
            if (c < n) lastFibboNumber = c;
        }
        System.out.println("Ostatnia liczba parzysta w ciągu to " + lastFibboNumber);
        return sum;
    }
}
