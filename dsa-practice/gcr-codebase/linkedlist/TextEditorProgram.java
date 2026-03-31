/*Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
 */
class TextNode{
    String text;
    TextNode prev,next;
    TextNode(String text){
        this.text = text;
    }
}


class TextEditor{
    private TextNode head,current;
    private int size = 0;
    private final int LIMIT = 10;

    void addState(String text){
        TextNode node = new TextNode(text);

        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
        }


        if(head == null){
            head = current = node;
        }
        else{
            current.next = node;
            node.prev = current;

            current = node;

        }
        size++;
        if(size>LIMIT){
            removeOldest();
        }
    }
        void undo(){
            if(current.prev != null && current.prev != null){
                current = current.prev;
            }
        }
        void redo(){
            if(current.next != null && current != null){
                current=current.next;
            }
        
        }

        void display(){
            System.out.println("current text: " + current.text);    
        }
        private void removeOldest(){
            head = head.next;
            head.prev = null;
            size--;
        }

    }




    public class TextEditorProgram{
        public static void main(String args[]){
            TextEditor editor = new TextEditor();




            System.out.println("Text Editor with Undo/Redo Functionality");
            
            editor.addState("State 1");
            editor.addState("State 2");
            editor.addState("State 3");
            editor.addState("State 4");
            editor.addState("State 5");
            editor.addState("State 6"); 


            editor.display();
            editor.undo();
            editor.display();
            editor.redo();
            editor.display();
            editor.redo();
            editor.display();
          
        }
    }
