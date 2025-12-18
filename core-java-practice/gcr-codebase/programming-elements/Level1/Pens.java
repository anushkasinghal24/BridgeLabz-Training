// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
// Hint => 
// Use Modulus Operator (%) to find the reminder.
// Use Division Operator to find the Quantity of pens
// I/P => NONE
// O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___





public class Pens {

    public static void main(String args[]){

        int totalPens = 14;
        int student = 3;

        int PenPerStudent = totalPens / student ;
        int RemainingStudent = totalPens % student;

        System.out.println("The pen per student is " + PenPerStudent + "and the remaining pen not distributed is " + RemainingStudent );





    }
    
}
