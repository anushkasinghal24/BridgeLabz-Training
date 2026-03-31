//Binary Seacrh Algo
/*You are given a 2D matrix where each row is sorted in ascending order, and the first element of each row is greater than the last element of the previous row. 
Write a program that performs Binary Search to find a target value in the matrix. 
If the value is found, return true. Otherwise, return false. */
import java.util.*;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / cols ;
            int col = mid % cols ;

            int midValue = matrix[row][col];

            if (midValue == target){
                return true;
            } else if (target < midValue){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print ("Enter columns : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println(" Enter matrix elements:");
        for ( int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
}

