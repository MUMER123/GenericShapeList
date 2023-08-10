public class Square extends Shape{
    private final int lengthofSide;
    public Square(){
        super();
        this.lengthofSide = 0;
    }

    public int getLengthofSide() {
        return lengthofSide;
    }

    public Square(int lengthofSide){
        super();
        this.lengthofSide = lengthofSide;
    }

    @Override
    public String draw(){
        return "This is a Square";
    }

    @Override
    public String getArea() {
        return "Area of the Square is: "+ this.lengthofSide*this.lengthofSide;
    }
}
