package flowControlLoopsAndArrays.thirtySecond;

import java.util.Scanner;

public class thirty2 {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Ivesk pirma skaiciu nustatyti reiksme");
        int skaicius1 = numberScanner.nextInt();

        System.out.println("Ivesk antra skaiciu nustatyti reiksme");
        int skaicius2 = numberScanner.nextInt();

        if (skaicius1 > 30) {
            System.out.println("pirmas skaicius daugiau nei 30");

            if (skaicius2 > 30) {
                System.out.println("antras skaicius daugiau nei 30");


            }

        }
    }
}
