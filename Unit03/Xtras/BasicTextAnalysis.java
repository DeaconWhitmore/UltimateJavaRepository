package Unit03.Xtras;

import java.util.Scanner;

public class BasicTextAnalysis {
    public static void main(String[] args) {
        
        Scanner words = new Scanner(System.in);
        words.useDelimiter("\\Z");
        String userwords = words.next();

        int totallength = (userwords.length()) + 1;

        int firstwordindex = userwords.indexOf(" ");
        String firstword = (userwords.substring(0, firstwordindex));

        int firstsentenceindex = userwords.indexOf(".");
        String firstsentence = (userwords.substring(0, firstsentenceindex));

        System.out.print("Your text is " + totallength + " characters long.");
        System.out.print(" Your text's first word is " + firstword + ".");
        System.out.print(" Your text's first sentence is " + firstsentence + ".");
    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit02.Xtras.BasicTextAnalysis
