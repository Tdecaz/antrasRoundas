package basic.intDivisionToDouble;

import java.util.Scanner;

public class division {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Ivesk pirma skaiciu");
        int x = numberScanner.nextInt();
        double xx = x;
        System.out.println("Ivesk antra skaiciu");
        int y = numberScanner.nextInt();
        double yy = y;
        double galinis_skaicius = xx / yy;
        System.out.printf("%.3f%n", galinis_skaicius);

        // System.out.println("Suapvalintas skaicius "+ tikras_skaicius + " is "+ Math.round(tikras_skaicius));
        //double apvalintas = Math.round(tikras_skaicius*100)/100;
        //String.format("%.3f", apvalintas); //%.3f defines decimal precision you want
        //System.out.println("apvalintas skaicius" + apvalintas);

    }
}
