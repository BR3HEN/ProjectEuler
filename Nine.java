package OneTen;

public class Nine {
    public static void main(String[] args)
    {
        long sumAB = 0, result = 0;
        for (int a = 1; a < 1000; a++)
        {
            for (int b = 1; b < 1000; b++)
            {
                for (int c = 1; c < 1000; c++)
                {
                    sumAB = (a * a) + (b * b);
                    int tempC = c * c;
                    if (sumAB == tempC && a < b && b < c) {
                        is1000(a, b, c);
                        if (is1000(a,b,c) == true) {
                            System.out.println("Dla a = " + a + " ,b = " + b + " ,c = " + c);
                            result = a * b * c;
                            System.out.println("Wynik to " + result);
                        }
                    }
                }
            }
        }
    }
    public static boolean is1000(int a, int b, int c)
    {
        return a + b + c == 1000? true:false;
    }
}
