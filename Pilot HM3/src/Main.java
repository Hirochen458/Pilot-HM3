import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

       while(running){
           if(scanner.hasNext()){
               String input = scanner.next();
               String[] arr = input.split(",");
               if("Add".equals(arr[0])){
                   list.add(arr[1]);
               }else if("Update".equals(arr[0])){
                   list.editNode(arr[1], arr[2]);
               }else if("Delete".equals(arr[0])){
                   list.deleteNode(arr[1]);
               }else if("Query".equals(arr[0])){
                   System.out.println(list.printList());
               }else{
                   running = false;
                   System.out.println("Please enter correct command and start again");
               }


           }
       }
    }
}