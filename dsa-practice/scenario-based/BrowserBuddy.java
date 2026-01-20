/*BrowserBuddy – Tab History Manager (Doubly Linked List + Stack)
Story: Neha is working on a custom browser. Each open tab maintains its browsing history with
"Back" and "Forward" operations. She uses a Doubly Linked List for history and a Stack to
hold closed tabs for reopening. */
import java.util.*;

class Node{
    String page;
    Node next, prev;

    Node(String page){
        this.page = page;
        
    }



}


class Tab{
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

public class BrowserBuddy{
    static Stack<Tab> closedTabs=new Stack<>();

    static Tab currentTab = new Tab();

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("Browser buddy");
            System.out.println("1. Visit page");
            System.out.println("2. Go back");
            System.out.println("3. Go forward");
            System.out.println("4. Close tab");
            System.out.println("5. Restore closed tab");
            System.out.println("6. Current page");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter page to visit: ");
                    String page = sc.nextLine();
                    currentTab.visitPage(page);
                    break;


                    case 2:
                        currentTab.goback();
                        break;

                        case 3:
                            currentTab.goforward();
                            break;

                            case 4:
                                closedTabs.push(currentTab);
                                currentTab = new Tab();
                                System.out.println("Tab closed");
                                break;

                                case 5:
                                    if(!closedTabs.isEmpty()){
                                        currentTab = closedTabs.pop();
                                        System.out.println("Restored tab");
                                    }
                                    else{
                                        System.out.println("No closed tabs");
                                    }
                                    
                                    break;

                                    case 6:
                                        System.out.println("Current page: " + currentTab.currentPage());
                                        break;

                                        case 7:
                                            System.out.println("Exiting");
                                            System.exit(0);
                                            break;

                                            default:
                                                System.out.println("Invalid choice");
                                                break;

            }


        }
    }
}