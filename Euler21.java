package TwentyOneThirty;

public class Euler21 {

    static boolean amicablePair(int sum, int i) {
        if (sumOfDivisors(i) == i) return false;
        return i == sumOfDivisors(sum);
    }

    static int sumOfDivisors(int n){
        int sumDiv = 0;
        for (int counter = 1; counter < n; counter++){
            if (n % counter == 0) sumDiv += counter;
        }
        return sumDiv;
    }

    public static void main(String[] args){
        int finalSum = 0;
        System.out.println(sumOfDivisors(220));
        for (int i = 1; i < 10000; i++){
            int tempSum = sumOfDivisors(i);
            if (amicablePair(tempSum, i)){
                finalSum += i;
            }
        }
        System.out.println(finalSum);
    }
}
