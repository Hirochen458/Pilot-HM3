public class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList(){
        head = new Node("");
        size = 0;
    }
    public void add(String val){
        Node newNode = new Node(val);
        //newNode.nextNode = null;
        if(size == 0){
            head = newNode;
            size++;
        }else{
            Node temp = head;
            for(int i = 1; i < size; i++){
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
            size++;
        }
    }
    public void editNode(String val, String newVal){
        Node temp = head;
        for(int i = 0; i < size; i++) {
            if (temp.value.equals(val)) {
                temp.value = newVal;
            }
            temp = temp.nextNode;
        }
    }
    public void deleteNode(String val){
        //Node temp = head;
        while(head != null && head.value.equals(val)) {
            head = head.nextNode;
            size--;
        }
        Node temp = head;
        while(temp.nextNode != null){
            if(temp.nextNode.value.equals(val)){
                temp.nextNode = temp.nextNode.nextNode;
                size--;
                //temp = temp.nextNode;
            }else{
                temp = temp.nextNode;
            }
        }
    }
    public String printList(){
        Node temp = head;
        StringBuilder result = new StringBuilder();
        while(temp != null){
            //System.out.println(temp.value);
            result.append(temp.value);
            result.append(" ");
            temp = temp.nextNode;
        }
        return result.toString();
    }
}
