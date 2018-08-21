public class Circle extends Shape {
    double radius;
    String color;
    @Override
    public String toString() {
        return "Circle: area = " +  area() + ", Diameter = " + diameter()  +  ", color = " + color;
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    double area() {
        return Math.PI * radius * radius ;
    }
    public String color() {
        return color;
    }
    public double diameter(){
        return radius * 2;
    }
}
