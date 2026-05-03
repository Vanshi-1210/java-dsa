// Program to take array size and elements as input
// from the user and print them
import java.util.*;
public class ArrayInputOutput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size=sc.nextInt();
        int Marks[]=new int[size];
        // for loop for input array elements
        for(int i=0;i<size;i++){
            Marks[i]=sc.nextInt();
        }
    // for loop for output of array elements
    System.out.println("Output of an array is-");
    for(int i=0;i<size;i++){
     System.out.println(Marks[i]);
    }
     sc.close();
    }
}