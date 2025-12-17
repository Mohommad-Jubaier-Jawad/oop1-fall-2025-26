package Lab;

abstract class Shape {
     String shapeName; 
    
    public Shape(String shapeName) { 
        this.shapeName = shapeName;
    }
    
    public String getShapeName() { 
        return shapeName;
    }
    
    abstract double area();
    
    @Override
    public abstract String toString();  
    
    public void printShape() {  
        System.out.println("The shape is " + shapeName);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String toString() {
        return "shape is " + shapeName + "the Radius: " + radius + " the Area: " + area() + "]";
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
    
    @Override
    public String toString() {
        return "shape is " + shapeName + " the Length: " + length + " the Width" + width+" the Area: " + area() + "]";
    }
}
public class LabTask3 {
    public static void main(String[] args){
      
        Shape circle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        
    }
}