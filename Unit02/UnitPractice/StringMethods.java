package Unit02.UnitPractice;

public class StringMethods {

    public static String helloName(String name) {
        return ("Hello " + name + "!");
    }

    public static String firstHalf(String str) {
        int a = str.length();
        int half = a/2;
        return str.substring(0, half);
    }

    public static boolean endsLy(String str) {
        // oddly
        // total = 5;
        // testing = 4;
        // str.substring(4, 5);
        int total = str.length();
        int testing = total - 2;

        if(str.substring(testing, total).equals ("ly") ){
            return true;
        }
        else {
            return false;
        }
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String withoutEnd(String str) {
        int check = str.length();
        int last = check - 1;
        String answer = str.substring(1, last);
        return answer;
    }

    public static String nTwice(String str, int n) {
        int see = str.length();
        int lasttwo = see - n;
        int firstone = 0 + n;
        String realanswer = str.substring(0, n) + str.substring(lasttwo, see);
        return realanswer;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String middleTwo(String str) {
        // str = "string"
        // totalone = 6
        int totalone = str.length();
        // half = 3
        int half = (totalone/2) + 1;
        // beforehalf = 2;
        int beforehalf = half - 2;
        // substring(2, 3);
        String trueanswer = str.substring(beforehalf, half);
        return trueanswer;
    }

    public static void main(String[] args) {
        // You can test your methods for specific inputs here. For example:
        System.out.println("helloName(\"Bella\") -> " + helloName("Bella"));
    }
}
