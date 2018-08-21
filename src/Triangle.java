public class Triangle extends Shape {
    double h;
    double a;
    String color;
    @Override
    public String toString() {
        return "Triangle: area = " +  area() + ", altitude = "  + h + ", color = " + color;
    }
    Triangle(double a, double h, String color){
        this.a = a;
        this.h = h;
        this.color = color;
    }
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    double area() {
        return (a * h)/2;
    }
    public String color() {
        return color;
    }
    public double altitude(){
        return h;
    }
}
