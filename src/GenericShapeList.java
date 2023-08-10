public class GenericShapeList {
    private Node head;
    GenericShapeList(){
        this.head = null;
    }
    public void addShape(Shape shape){
        Node node = new Node(shape);
        if(this.head==null) {
            this.head = node;
        }else{
            Node temp = this.head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }
    public void removeShape(int index){
        if(index==0){
            this.head = this.head.getNext();
        }else{
            Node temp = this.head;
            for(int i=0;i<index-1;i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
    }
    public void traversal(){
        Node temp = this.head;
        int count = 1;
        while(temp!=null){
            System.out.println(count+" "+temp.getData().toString());
            temp = temp.getNext();
            count++;
        }
    }

}
