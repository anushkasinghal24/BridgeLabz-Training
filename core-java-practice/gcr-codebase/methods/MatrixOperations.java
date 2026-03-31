
/*Write a program to perform matrix manipulation operations like finding the transpose, determinant, and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
Hint => 
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to find the transpose of a matrix
           
Write a Method to find the determinant of a 2x2 matrix

Write a Method to find the determinant of a 3x3 matrix
 
Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix
*/
//package methods;

import java.util.*;
public class MatrixOperations{

    static Random r=new Random();

    static double[][] createMatrix(int n){
        double[][] m = new double[n][n];
        for(int i = 0;i <n ; i++){
            for(int j = 0 ;j<n ;j++){
                m[i][j] = r.nextInt(9)+1;
            }
           
        }
        
         return m;
    }

        static void display(double[][] m){
            for(double[] row:m){
                for(double v:row)
                    System.out.printf("%6.2f",v);
                System.out.println();    
            }
        }

        static double[][] transpose(double[][] m){
            double[][] t=new double[m[0].length][m.length];
            for(int i =0 ; i<m.length;i++)
                for(int j = 0; j<m[0].length;j++)
                    t[j][i] = m[i][j];
            return t;        
        }


        static double det2(double[][] m){
            return m[0][0]*m[1][1]-m[0][0]*m[1][0];
        }

        static double det3(double[][] m){
            return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                -m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                +m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        }

        static double[][] inv2(double[][] m){
            double d=det2(m);
            if(d==0) return null;
            return new double[][]{
                {m[1][1]/d,  -m[0][1]/d},
                {-m[1][0]/d,  m[0][0]/d}
                 };
            }

            static double[][] inv3(double[][] m){
                double d=det3(m);
                if(d==0) return null;

            return new double[][]{
                {(m[1][1]*m[2][2]-m[1][2]*m[2][1])/d,
                (m[0][2]*m[2][1]-m[0][1]*m[2][2])/d,
                (m[0][1]*m[1][2]-m[0][2]*m[1][1])/d},
                
                {(m[1][2]*m[2][0]-m[1][0]*m[2][2])/d,
                (m[0][0]*m[2][2]-m[0][2]*m[2][0])/d,
                (m[0][2]*m[1][0]-m[0][0]*m[1][2])/d},
                
                {(m[1][0]*m[2][1]-m[1][1]*m[2][0])/d,
                (m[0][1]*m[2][0]-m[0][0]*m[2][1])/d,        
                (m[0][0]*m[1][1]-m[0][1]*m[1][0])/d}

            };

        }

            public static void main(String[] args){
                double[][] m2 = createMatrix(2);
                System.out.println("2x2 Matrix");
                display(m2);
                
                System.out.println("Inverse");
                display(inv2(m2));
                
                double[][] m3 = createMatrix(3);
                System.out.println("3x3 Matrix");
                display(m3);
                
                System.out.println("Inverse");
                display(inv3(m3));

            }

        }
    


