public class Trapeze extends Shape {
    double a;
    double b;
    double h;
    String color;
    @Override
    public String toString() {
        return "Trapeze: area = " +  area()  + " , MiddleLine = " + middleLine() +  ", color = " + color;
    }
    Trapeze(double a, double b, double h, String color){
        this.a = a;
        this.b = b;
        this.h = h;
        this.color = color;
    }
    public void draw() {
        System.out.println("Trapeze.draw()");
    }
    @Override
    double area() {
        return ((a + b)/2) * h;
    }
    public String color() {
        return color;
    }
    public double middleLine(){
        return (a + b)/2;
    }
}
