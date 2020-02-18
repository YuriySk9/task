package generator;

import java.util.Random;

public class Values {
    public static double getValue() {
        Random random = new Random();
        return Math.random() + random.nextInt(100);
    }
}
