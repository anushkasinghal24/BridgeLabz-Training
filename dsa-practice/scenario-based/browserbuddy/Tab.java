package browserbuddy;

public class Tab{
    Node current;

    public void visitPage(String page){
        Node newNode = new Node(page);

        if(current != null){
            current.next = newNode;
            newNode.prev = current;
        
        }

        current = newNode;
        System.out.println("Visited page: " + page);

    }


    public void goback(){
        if(current != null &&current.prev != null){
            current = current.prev;
            System.out.println("Went back to page: " + current.page);
        }
        else{
            System.out.println("No pages to go back");
        
        }
    }


    public void goforward(){
        if(current != null &&current.next != null){
            current = current.next;
            System.out.println("Forwarded to: " + current.page);
            }
        else{
            System.out.println("No pages to go forward");
        
        }

    }


    public String currentPage(){
        return current != null ? current.page :"Empty tab";
    }




}
