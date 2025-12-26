/*Write a program to perform matrix manipulation operations like addition, subtraction, and multiplication. The program should take random matrices as input and display the result of the operations.
Hint => 
Write a Method to create a random matrix, taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices
*/
//package methods;
import java.util.*;
public class MatrixAirthemeticOperations{

    static Random r=new Random();

    static int[][] createMatrix(int rows,int cols){
        int[][] m=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                m[i][j]=r.nextInt(9)+1;
            }
        }

        return m;

    }


    static void display(int[][] m){
        for(int[] row:m){
        	
            for(int v:row){
            	
                System.out.printf("%4d",v);
            }
            System.out.println();
        
        }
    }

    static int[][] addMatrix(int[][] m1,int[][] m2){
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] m = new int[rows][cols];

        for(int i = 0; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return m;
    

    }

    static int[][] subtractMatrix(int[][] m1,int[][] m2){   

        int rows = m1.length;
        int cols = m1[0].length;
        int[][] m = new int[rows][cols];

        for(int i = 0 ; i<rows ; i++){
            for(int j = 0;j<cols;j++){
                m[i][j] = m1[i][j]-m2[i][j];
            }
        }
        return m;   
    }


    static int[][] multiplyMatrix(int[][] m1,int[][] m2){
        int rows1 = m1.length;
        int cols1 = m1[0].length;
        int rows2 = m2.length;
        int cols2 = m2[0].length;
        int[][] m = new int[rows1][cols2];

        if(cols1!=rows2) return null;

        for(int i = 0;i<rows1;i++){
            for(int j = 0;j<cols2;j++){
                for(int k = 0;k<cols1;k++){
                    m[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] A = createMatrix(3,3);
        int[][] B = createMatrix(3,3);
        System.out.println("Matrix A");
        display(A);
        System.out.println("Matrix B");
        display(B);     

        System.out.println("addition");
        display(addMatrix(A, B));

        System.out.println("substraction");
        display(subtractMatrix(A, B));

        System.out.println("multiplication");
        display(multiplyMatrix(A, B));

    
    }


}