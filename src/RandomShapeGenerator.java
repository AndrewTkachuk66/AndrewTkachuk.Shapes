import java.util.*;
public class RandomShapeGenerator {
    static Random rand = new Random();
    String[] colors = {"white", "black", "red", "pink", "blue", "yellow", "green"};

    String randColor(String[] colors) {
        return (colors[rand.nextInt(colors.length)]);
    }

    double randDouble() {
        double d = 1 + rand.nextDouble() * 100;
        return d;
    }

    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0:
                return new Circle(randDouble(), randColor(colors));
            case 1:
                return new Square(randDouble(), randColor(colors));
            case 2:
                return new Triangle(randDouble(),randDouble(),randColor(colors));
            case 3:
                return new Trapeze(randDouble(),randDouble(),randDouble(),randColor(colors));
        }
    }

    public static void main(String[] args) {
        RandomShapeGenerator r = new RandomShapeGenerator();
        Shape[] shapes = new Shape[1 + rand.nextInt(120)];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = r.next();
            System.out.println(shapes[i]);
        }
    }
}