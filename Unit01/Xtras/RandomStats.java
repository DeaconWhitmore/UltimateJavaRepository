package Unit01.Xtras;

public class RandomStats {
    public static void main(String[] args) {
            double a = Math.random ();
            double b = Math.random ();
            double c = Math.random ();
            double d = Math.random ();
            double e = Math.random ();
            double sum = (a + b + c + d + e)/5;
            double min = Math.min(Math.min(Math.min(Math.min (a, b), c), d), e);
            double max = Math.max(Math.max(Math.max(Math.max (a, b), c), d), e);
            System.out.println (sum);
            System.out.println (min);
            System.out.print (max);
    }
}
