package OneTen;

public class Euler6 {
    public static void main(String[] args){
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
        long sumOfSq = 0;//suma potęg
        long sqOfSum = 0;//potęga sumy
        for (long i = 1; i <= 100; i++)
        {
            sumOfSq += i * i;
            sqOfSum += i;
            if (i == 100) sqOfSum = sqOfSum * sqOfSum;
        }
        System.out.println("Różnica wynosi " + (sqOfSum - sumOfSq));
    }
}
