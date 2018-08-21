public class Square extends Shape {
    double side;
    String color;

    @Override
    public String toString() {
        return "Square: area = " +  area()  + ", side lendth = " + side + ", color = " + color;
    }

    Square(double side, String color){
        this.side = side;
        this.color = color;
    }
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    double area() {
        return side * side;
    }
    public String color() {
        return color ;
    }
    public double side(){
        return side;
    }
}
