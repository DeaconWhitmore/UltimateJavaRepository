package Unit03.Xtras;

import java.util.Scanner;

public class DiscordTagGenerator {
    public static void main(String[] args) {
        int rnone = (int) ((Math.random()) * 10);
        int rntwo = (int) ((Math.random()) * 10);
        int rnthr = (int) ((Math.random()) * 10);
        int rnfou = (int) ((Math.random()) * 10);
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a username");
        String username = input.nextLine();

        System.out.print(username + "#" + rnone + rntwo + rnthr + rnfou);
        input.close();
    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator