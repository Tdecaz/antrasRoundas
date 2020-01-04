package flowControlLoopsAndArrays.thirtySecond;

import java.util.Scanner;

public class thirty23 {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);


        System.out.println("Ivesk pirma skaiciu nustatyti reiksme");
        int skaicius1 = numberScanner.nextInt();

        System.out.println("Ivesk antra skaiciu nustatyti reiksme");
        int skaicius2 = numberScanner.nextInt();

        if (skaicius1 > 30) {
            System.out.println("pirmas skaicius yra didesnis nei 30");
        } else if (skaicius1 == 30) {
            System.out.println("pirmas skaicius yra lygus 30");

        } else if (skaicius1 < 30) {
            System.out.println("pirmas skaicius yra mazesnis nei 30");
        }

        if (skaicius2 > 30) {
            System.out.println("antras skaicius yra didesnis nei 30");
        } else if (skaicius2 == 30) {
            System.out.println("antras skaicius yra lygus 30");

        } else if (skaicius2 < 30) {
            System.out.println("antras skaicius yra mazesnis nei 30");
        }

    }
}
