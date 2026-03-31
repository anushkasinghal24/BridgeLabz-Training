/*Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number. */
class Node{
int rollNo;
String name;
int age;
char grade;
Node next;

    public Node(int rollNo, String name, int age, char grade, Node next) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    
}
public class StudentRecordManagement{
    Node head;
    public void insertAtEnd(int rollNo,int age,String name,char grade){
        Node newNode = new Node(rollNo, name, age, grade, null);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtBegining(int rollNo, int age, String name, char grade){
        this.head = new Node(rollNo, name, age, grade,null);
    }


    public void insertAtSpecificPosition(int rollNo, int age, String name,char grade){
        Node node = new Node(rollNo,name,age,grade,null);
        if(head == null){
            head = node;
        }
        else{
            Node current = head;
            int count = 1;
            while(current.next != null && count < 2){
                current = current.next;
                count++;
            }
            current.next = node;
        }
    }

    public void deleteByRoll(int rollNo){

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNo == rollNo){
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        //for searching the particular roll No.
        while(current != null && current.rollNo != rollNo){
            previous = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("Record not found");
            return;
        }
        previous.next = current.next;
    }

    public Node searchByRoll(int rollNo){
        Node current = head;
        if(head == null){
            System.out.println("Not found");
            return null;
        }
        if(head.rollNo == rollNo){
            head= head.next;
            return current;
            
        }
        else{
            while(current != null && current.rollNo != rollNo){
                current= current.next;
            }
            if(current==null){
                 System.out.println("Not found");
                 return null;
                }
            return current;
        }
    }

    public void updateGradeByRoll(int rollNo,char grade){
        Node current = head;
        if(head == null){
            System.out.println("Not Found");
            return;
        }
        if(head.rollNo == rollNo){
            head.grade = 'A';
        }
        else{
            while(current != null && current.rollNo != rollNo){
                current = current.next;
            }
            if(current == null){
                System.out.println("Not Found");
                return;
            }
            current.grade = 'A';
        }
    }         

    public void displayRecords(){
        Node current = head;
        while(current != null){
            System.out.println("Roll No: " + current.rollNo + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        StudentRecordManagement obj = new StudentRecordManagement();
        obj.insertAtBegining( 01 ,18,"Anushka",'A');
        obj.insertAtSpecificPosition(02, 19, "Hello", 'C');
        obj.insertAtEnd(03, 12, "Willams", 'B');
        Node record = obj.searchByRoll(02);
        System.out.println("Name : " + record.name + " , Age : " +record.age + " , Grade : " + record.grade);

    }
}