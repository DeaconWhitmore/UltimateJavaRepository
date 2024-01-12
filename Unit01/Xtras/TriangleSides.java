package Unit01.Xtras;

import java.util.Arrays;

public class TriangleSides {
    public static void main(String[] args) {
        System.out.println (Arrays.toString(args));
        int sidea = Integer.parseInt (args[0]);
        int sideb = Integer.parseInt (args[1]);
        int sidec = Integer.parseInt (args[2]);
        if (sidea <= (sideb + sidec) && sideb <= (sidea + sidec) && sidec <= (sidea + sideb)){
        System.out.print("Is a Triangle");}
        else {System.out.print("Is not a Triangle");}
    }
}
