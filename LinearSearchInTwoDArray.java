// Program to perform linear search in a 2D array
import java.util.*;
public class LinearSearchInTwoDArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns:");
        int columns=sc.nextInt();
        int array[][]=new int[rows][columns];
        // loop for taking iput
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j]=sc.nextInt();
            }
        }
        // loop for output
        System.out.print("Enter value of x you want to be searched:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(array[i][j]==x){
              System.out.println("X found at location-"+i+","+j);
                }
            }
        }
        sc.close();
    }
}