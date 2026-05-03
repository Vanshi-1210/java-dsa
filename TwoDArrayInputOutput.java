// Program to take 2D array input from user
// and print its elements
import java.util.*;
public class TwoDArrayInputOutput {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter rows of an array:");
     int rows=sc.nextInt();
     System.out.print("Enter columns of an array:");
     int columns=sc.nextInt();
     int Array[][]=new int[rows][columns];
        // for loop for taking an input
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Array[i][j]=sc.nextInt();
            }
        }
        // for loop for output
        System.out.println("Output of an array-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
