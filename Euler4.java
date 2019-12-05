package OneTen;

public class Euler4 {
    public static void main(String[] arg) {
//Find the largest palindrome made from the product of two 3-digit numbers.
        int maxResult = 0;
        for (int i = 100; i <= 999; i++)
        {
            for (int j = 100; j <= 999; j++)
            {
                int reversed = 0;
                int multiplication = i * j;//mnożenie 3 cyfrowych liczb
                for(int temp = multiplication; temp != 0; temp /= 10)//pętla do odwrócenia wyniku mnożenia
                {
                    int digit = temp % 10;
                    reversed = reversed * 10 + digit;
                }
                if (multiplication == reversed)//warunek jeśli są sobie równe
                {
                    if (maxResult < multiplication) {//warunek, zapisz największy wynik
                        maxResult = multiplication;
                    }
                }
            }
        }
        System.out.println("Wynik to " + maxResult);
    }
}
