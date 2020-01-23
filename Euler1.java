package OneTen;
//Find the sum of all the multiples of 3 or 5 below 1000.
class Below1000{

    int sum = 0;

    public int sumDivisibleBy(int DivisibleByA, int DivisibleByB)
    {
        for ( int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0)
            {
               sum += i;
            }
        }
        return sum;
    }
}
public class Euler1 {
    public static void main(String[] args){
//Find the sum of all the multiples of 3 or 5 below 1000.

        Below1000 result = new Below1000();
        System.out.println(result.sumDivisibleBy(3, 5));
    }
}
