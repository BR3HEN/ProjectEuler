package ElevenTwenty;
//What is the value of the first triangle number to have over five hundred divisors?
public class Twelve {
    public static void TriangleNum(){//liczy triangle numbers i odwołuje się do metody sprawdzającej ilość dzielników
        int triNum = 1;
        for (int i = 1;; i++){
            triNum = ((i + 1) * i) / 2;
            if (divisors500(triNum)) {
                System.out.println("Wynik to : " + triNum);
                break;
            }
        }
    }

    public static boolean divisors500(int triangleNum){
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(triangleNum); i++){//pierwiastek kw. z l. całk. prawie zawsze daje 1/2 ilość jej dzielników
            if (triangleNum % i == 0) counter += 2;//za wyjątkiem idealnych pierw. kw tj. 4,9,16..
        }
        counter *= 2;//pomnóż licznik x2 ponieważ wcześniej dawał połowe wyniku
        if (counter > 500) return true;
        return false;
    }
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        TriangleNum();//wywołaj metodę
        long finish = System.currentTimeMillis();
        System.out.println("Zadanie wykonane w " + (finish - start) + " milisec");

    }
}
