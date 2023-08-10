public class Circle extends Shape{
    private final int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public String draw(){
        return "This is a Circle";
    }
    public String getArea() {
        return "Area of the Circle is: " + 3.14 * this.radius * this.radius;
    }
}
