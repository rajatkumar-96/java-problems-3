import java.util.*;

public class MatrixAddition{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input number of rows of matrix");
        int rows= input.nextInt();
        System.out.println("Input number of columns of matrix");
        int columns= input.nextInt();
        int [][] matrix1= new int[rows][columns];
        int [][] matrix2= new int[rows][columns];
        System.out.println("enter the elements of matrix 1");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix1[i][j]=input.nextInt();
                          
            }
        }
        System.out.println("enter the elements of matrix 1");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix2[i][j]=input.nextInt();
                          
            }
        }
        System.out.println("Sum of the matrices-");
        for(int i=0;i<rows;i++){
            System.out.println("\n");
            for(int j=0;j<columns;j++){
                System.out.print(matrix1[i][j]+matrix2[i][j] + "  ");
                
                          
            }
        }

    }
}