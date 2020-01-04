package flowControlLoopsAndArrays.zero2nine;

import java.util.Scanner;

public class zero2nine4 {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Ivesk skaiciu nustatyti reiksme");
        String skaicius = numberScanner.nextLine();

        switch (skaicius) {
            case ("0"): {
                System.out.println("ZerO");
                break;
            }
            case ("1"): {
                System.out.println("One");
                break;
            }
            case ("2"): {
                System.out.println("Two");
                break;
            }
            case ("3"): {
                System.out.println("Three");
                break;
            }
            case ("4"): {
                System.out.println("Four");
                break;
            }
            case ("5"): {
                System.out.println("Five");
                break;
            }
            case ("6"): {
                System.out.println("Six");
                break;
            }
            case ("7"): {
                System.out.println("Seven");
                break;
            }
            case ("8"): {
                System.out.println("Eight");
                break;
            }
            case ("9"): {
                System.out.println("Nine");
                break;
            }
            default:
                System.out.println("Atsakymo nebus");
}
}
}
