public class Main {
    public static void main(String[] args) {
        GenericShapeList list = new GenericShapeList();
        for(int i = 0;i<33;i++){

            list.addShape(new Rectangle(i,i+1));

            list.addShape(new Square(i+2));

            list.addShape(new Circle(i+3));
        }
        list.traversal();
    }
}