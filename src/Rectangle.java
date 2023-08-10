public class Rectangle extends Shape{
    private final int length;
    private final int breadth;
    public Rectangle(){
        this.length = 0;
        this.breadth = 0;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    public String draw(){
        return "This is a Rectangle";
    }
    public String getArea() {
        return "Area of the Rectangle is: " + this.length * this.breadth;
    }
}
