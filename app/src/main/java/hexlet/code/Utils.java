package hexlet.code;

public class Utils {
    public static int getRandomInt(int min, int max) {
        double f = Math.random() / Math.nextDown(1.0);
        return (int) Math.round(min * (1.0 - f) + max * f);
    }
}
