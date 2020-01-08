package flowControlLoopsAndArrays.nestedLoops;

public class eglute5 {

    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i < size; i += 2) {
            for (int k = size; k >= i; k -= 2) {
                System.out.print(".");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       for (int i = 1; i <= size; i += 2) {
          for (int k = 1; k <= i; k += 2) {
               System.out.print(".");
            }
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
           System.out.println();
        }
   }
}











       /*  {
            for (int i = 0; i < 5; i++) {
                for (int j = i; j < 5; j++) {


                    System.out.print("*");
                    //;
                }
                System.out.println();
            }
        }
    }
*/

// trikampis
   /* public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
                //;
            }
            System.out.println();
        }
    }*/