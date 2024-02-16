package Unit04;

import java.util.Scanner;

public class StringLoops {

    public static boolean xyzThere(String str) {

        Scanner xyzThere = new Scanner(System.in);
        String xyzstring = xyzThere.next();
        int begin = xyzstring.indexOf("x");

        if (xyzstring.substring(begin - 1, begin).equals(".")) {
            return false;
        } else if (xyzstring.substring(begin, begin + 2).equals("xyz")) {
            return true;
        }
    }

    public static String zipZap(String str) {

        return "";
    }

    public static String doubleChar(String str) {

        Scanner doubleChar = new Scanner(System.in);
        String doubleCharinput = doubleChar.next();
        int stopdouble = doubleChar.length();

        

        return "";
    }

    public static int countCode(String str) {
        return 0;
    }

    public static boolean bobThere(String str) {
        return false;
    }

    public static boolean prefixAgain(String str, int n) {
        return false;
    }

    public static boolean sameStarChar(String str) {
        return false;
    }

    public static String starOut(String str) {
        return "";
    }

    public static int countHi(String str) {
        return 0;
    }

    public static boolean endOther(String a, String b) {
        return false;
    }

    public static boolean xyBalance(String str) {
        return false;
    }

    public static String plusOut(String str, String word) {
        return "";
    }

    public static boolean catDog(String str) {
        return false;
    }

    public static String mixString(String a, String b) {
        return "";
    }

    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }
}
