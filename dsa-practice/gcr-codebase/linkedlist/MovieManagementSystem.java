/*Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
Add a movie record at the beginning, end, or at a specific position.
Remove a movie record by Movie Title.
Search for a movie record by Director or Rating.
Display all movie records in both forward and reverse order.
Update a movie's Rating based on the Movie Title.
 */
import java.util.*;
class MovieNode{
    String title;
    String director;
    int year;
    double rating;
    MovieNode next,prev;

    MovieNode(String title,String director, int year, double rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating=rating;

    }

}


class MovieDoublyLinkedList{
    private MovieNode head,tail;

    void addAtBeginning(String title, String director, int year, double rating){
        MovieNode newNode=new MovieNode(title,director,year,rating);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;

        }
        System.out.println("movie added at the beginning");
    }

    void addAtEnd(String title, String director, int year, double rating){
        MovieNode newNode=new MovieNode(title,director,year,rating);

        if(tail==null)
            head=tail=newNode;
        
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        System.out.println("movie added at the end");
}


        void addAtPosition(int position, String title, String director, int year, double rating){
            if(position<=1){
                addAtBeginning(title,director,year,rating);
                return;
            }

            MovieNode temp=head;
            for(int i=1;i<position-1 && temp!=null;i++)
                temp=temp.next;
            
            if(temp==null || temp==tail){
                addAtEnd(title,director,year,rating);
                return;
            
            }
            MovieNode newNode=new MovieNode(title,director,year,rating);
            newNode.next=temp.next;
            newNode.prev=temp;
            temp.next.prev=newNode;
            temp.next=newNode;
            System.out.println("movie added at the position" +position);


    }



    void removeByTitle(String title){
        MovieNode temp=head;
        while(temp !=null){
            if(temp.title.equalsIgnoreCase(title)){
                if(temp==head){
                    head=head.next;
                    if(head!=null) head.prev=null;
                }else if (temp==tail){
                    tail=tail.prev;
                    tail.next=null;
                    }else{
                        temp.prev.next=temp.next;
                        temp.next.prev=temp.prev;

                }
                System.out.println("movie removed");
                return;
            
            }
                temp=temp.next;
            
        }
            System.out.println("movie not found");
        
    }



    void searchByDirector(String director){
        MovieNode temp=head;
        boolean found=false;
        while(temp!=null){
            if(temp.director.equalsIgnoreCase(director)){
                printMovie(temp);
                found=true;
               
    }

    temp=temp.next;
        }
        if(!found)
            System.out.println("movie not found");
    }



    void searchByRating(double rating){
        MovieNode temp=head;

        boolean found=false;


        while(temp!=null){
            if(temp.rating>=rating){

                printMovie(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found)
            System.out.println("movie not found");
    }


    void updateRating(String title, double newRating){
        MovieNode temp=head;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(title)){
                temp.rating=newRating;
                System.out.println("rating updated");
                return;
            
            }
            temp=temp.next;

        }
        System.out.println("movie not found");

    }


    void displayForward(){
        MovieNode temp=head;
        if(temp==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            printMovie(temp);
            temp=temp.next;
        }
    }


    void displayReverse(){
        MovieNode temp=tail;
        if(temp==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            printMovie(temp);
            temp=temp.prev;
        }
    }

    private void printMovie(MovieNode m){
        System.out.println("title: "+m.title);
        System.out.println("director: "+m.director);
        System.out.println("year: "+m.year);
        System.out.println("rating: "+m.rating);
        System.out.println();
    }
}





    public class MovieManagementSystem{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            MovieDoublyLinkedList list=new MovieDoublyLinkedList();
            int choice;

            do{
                System.out.println("movie management system");
                System.out.println("1. add at beginning");
                System.out.println("2. add at end");
                System.out.println("3. add at position");
                System.out.println("4. remove by title");
                System.out.println("5. search by director");
                System.out.println("6. search by rating");
                System.out.println("7. update rating");
                System.out.println("8. display forward");
                System.out.println("9. display reverse");
                System.out.println("0. exit");
                choice=sc.nextInt();
                sc.nextLine();


                switch(choice){
                    case 1,2,3->{
                        System.out.println("title: ");
                        String title=sc.nextLine();
                        System.out.println("director: ");
                        String director=sc.nextLine();
                        System.out.println("year: ");
                        int year=sc.nextInt();  
                        System.out.println("rating: ");
                        double rating=sc.nextDouble();


                        if(choice==1)
                            list.addAtBeginning(title,director,year,rating);
                        else if(choice==2)
                            list.addAtEnd(title,director,year,rating);
                        else
                            System.out.println("position: ");
                        int position=sc.nextInt();
                            list.addAtPosition(position,title,director,year,rating);
                        


                    }
                


                case 4->{
                    System.out.println("title: ");
                    String title=sc.nextLine();
                    list.removeByTitle(title);

                }

                case 5->{
                    System.out.println("director: ");
                    String director=sc.nextLine();
                    list.searchByDirector(director);

                }

                case 6->{
                    System.out.println("rating: ");
                    double rating=sc.nextDouble();
                    list.searchByRating(rating);


                }
                case 7->{
                    System.out.println("title: ");
                    String title=sc.nextLine();
                    System.out.println("new rating: ");
                    double newRating=sc.nextDouble();
                    list.updateRating(title,newRating);

                }
                case 8->{
                    list.displayForward();
                }
                case 9->{
                    list.displayReverse();
                }
                case 0->{
                    System.out.println("exiting....");
                }
                default->{
                    System.out.println("invalid choice");
                
                }


            }
            

            }while(choice !=0);
    }


}