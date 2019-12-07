package basic.aVar;

import java.util.Scanner;

public class RoundTwoNumbers2 {
    public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Ivesk skaiciu su daugiau nei 2 skaiciais po kablelio");
        String skaicius = inputScanner.nextLine();
        double tikras_skaicius = Double.parseDouble(skaicius);
        System.out.printf("%.2f%n", tikras_skaicius);

       // System.out.println("Suapvalintas skaicius "+ tikras_skaicius + " is "+ Math.round(tikras_skaicius));
        //double apvalintas = Math.round(tikras_skaicius*100)/100;
        //String.format("%.3f", apvalintas); //%.3f defines decimal precision you want
        //System.out.println("apvalintas skaicius" + apvalintas);


    }
}
