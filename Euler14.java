package ElevenTwenty;
//https://projecteuler.net/problem=14
public class Euler14 {
    public static long even(long n){
        return n/2;
    }

    public static long odd(long n){
        return 3*n + 1;
    }

    public static void count(long num){
        int chainLenght = 0;
        long numberWithTheLongestChain = 0;
        for (long i = 2; i <= num; i++) {
            int counter = 0;
            long j = i;
            while (j != 1) {
                counter ++;
                if (j % 2 == 0) {
                    j = even(j);
                } else {
                    j = odd(j);
                }
                if (chainLenght < counter){
                    chainLenght = counter;
                    numberWithTheLongestChain = i;
                }
            }//j
        }//i
        System.out.println(chainLenght + " znaków znajduje się w łańcuchu liczby " + numberWithTheLongestChain);
    }
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        count(1000000);
        long finish = System.currentTimeMillis();
        double time = (finish - start)/1000.00;
        System.out.printf("Wykonano w %.2f sekundy", time);
    }
}
