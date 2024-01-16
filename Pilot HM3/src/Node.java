public class Node {
    Node nextNode;
    String value;

    public Node(){
        nextNode = null;
        value = "";
    }
    public Node(String value){
        nextNode = null;
        this.value = value;
    }


    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }

    public Node getNext(){
        return nextNode;
    }

    public void setNextNode(Node node){
        this.nextNode = node;
    }
}
