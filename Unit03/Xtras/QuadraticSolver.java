package Unit03.Xtras;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) { 
        
        Scanner values = new Scanner(System.in);
        
        System.out.println("Please enter the a value");
        Double tav = Double.parseDouble(values.nextLine());

        System.out.println("Please enter the b value");
        Double tbv = Double.parseDouble(values.nextLine());

        System.out.println("Please enter the c value");
        Double tcv = Double.parseDouble(values.nextLine());

        double possol = (-tbv + Math.sqrt(Math.pow(tbv, 2) - 4 * tav * tcv))/2 * tav;

        double negsol = (-tbv - Math.sqrt(Math.pow(tbv, 2) - 4 * tav * tcv))/2 * tav;

        System.out.print("The Solutions Are " + possol + " And " + negsol);
        values.close();
    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver