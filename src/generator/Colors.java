package generator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Colors {
    black, red, white, brown, blue;

    private static List<Colors> values = Arrays.asList(values());
    private static int SIZE = values.size();
    private static Random random = new Random();

    public static Colors randomColor()  {
        return values.get(random.nextInt(SIZE));
    }
}
