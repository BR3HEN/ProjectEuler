package OneTen;

public class Five {
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    static boolean divisibleBy(int a)
    {
        for (int i = 1; i <= 20; i++)
        {
            if (a % i != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        for (int a = 1;;a++)
        {
            if (divisibleBy(a) == true)
            {
                System.out.println(a);
                break;
            }
        }
    }
}
