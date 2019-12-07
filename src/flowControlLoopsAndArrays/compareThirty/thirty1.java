package flowControlLoopsAndArrays.compareThirty;

import java.util.Scanner;

public class thirty1 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Ivesk skaiciu nustatyti reiksme");
        String skaicius = inputScanner.nextLine();
        int tikras_skaicius = Integer.parseInt(skaicius);

        if (tikras_skaicius < 30) {
            System.out.println("maziau nei 30");
        } else if (tikras_skaicius > 30) {
            System.out.println("daugiau nei 30");
        } else {
            {
                System.out.println("lygu 30");
            }
        }
    }
}


