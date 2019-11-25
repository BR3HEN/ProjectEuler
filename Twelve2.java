package ElevenTwenty;

import java.util.ArrayList;
import java.util.List;

//What is the value of the first triangle number to have over five hundred divisors?
//http://www.math.edu.pl/narzedzia.php?opcja=liczba-dzielnikow
public class Twelve2 {
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
        List<Integer> licznik = new ArrayList<Integer>();

        for (int j = 2; j <= triangleNum; j++){//start, dzielenie od j = 2
            int counter = 0;
            while (j <= triangleNum){//pętla zliacza ile razy dzieliła przez j
                if (triangleNum % j == 0){//jeśli reszta z dzielenia da 0 to zmniejsz l. trój. i dodaj do licznika dzielnika j
                    triangleNum = triangleNum / j;
                    counter++;
                    if (triangleNum == 1) {//jeśli j będzie równe 1 to oznacza koniec liczenia, dodaj do j + 1 aby wyjść z obu pętli
                        licznik.add(counter);
                        j ++;
                    }
                } else {// jeśli będzie reszta z dzielenia to oznacza, że liczba już nie jest podzielna przez tę samą liczbę, więc dodaj do tablicy ile razy została przez nią podzielona i wyjdź z pęt. wew.
                    licznik.add(counter);
                    break;
                }
            }
        }

        int numOfDiv = 1;
        for (int i = 0; i < licznik.size(); i++){
            numOfDiv *= licznik.get(i) + 1;
        }
        if (numOfDiv > 500) {
            System.out.println("Liczba dzielników to: " + numOfDiv);
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        TriangleNum();//wywołaj metodę
        long finish = System.currentTimeMillis();
        System.out.println("Zadanie wykonane w " + (finish - start) + " milisec");

    }
}

