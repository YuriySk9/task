import generator.Colors;
import generator.Values;
import shapes.*;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<Shape> creator = new ArrayList<>();
        creator.add(new Circle(Colors.randomColor().toString(), Values.getValue()));
        creator.add(new Square(Colors.randomColor().toString(), Values.getValue()));
        creator.add(new Trapeze(Colors.randomColor().toString(), Values.getValue(), Values.getValue(), Values.getValue()));
        creator.add(new Triangle(Colors.randomColor().toString(), Values.getValue(), Values.getValue()));

        Random random = new Random();
        int shapeCount = random.nextInt(100);

        for (int i=1; i<=shapeCount; i++)
        {
            int generateRandomShape = random.nextInt(creator.size());
            System.out.println(i + ": " + creator.get(generateRandomShape));
        }
    }
}
