// package Unit04;

public class Topic4_3AlgorithmsUsingStrings {

    public static String reverseString(String str) {
        String result = "";

        // for (int i = str.length() - 1; i >= 0; i--) {
        //     result = result + str.substring(i, i+1);
        // }

        // for (int i = 0; i < str.length(); i++) {
        //     result = str.substring(i, i + 1) + result;
        // }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(reverseString("hello"));

    }
}

// javac Unit04\Topic4_3AlgorithmsUsingStrings.java
// java Unit04.Topic4_3AlgorithmsUsingStrings