// Program to take array input from user
// and search an element using linear search
// Taking element to search from user
import java.util.*;
public class LinearSearchInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        // for loop for taking an input
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        // for loop for output
        System.out.print("Enter value of x that u want to be searched:");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if (array[i]==x){
                System.out.println("found at index-"+i);
            }
            else{
                System.out.println("not present in array");
            }
        }
        sc.close();
    }
}
