// Program demonstrating basic bit manipulation operations in Java
import java.util.*;
public class BitManipulationDemo {
    public static void main(String[] args) {
        // get bit
        // int n=5;
        // int pos=3;
        // int bitmask=1<<pos;
        // if((bitmask&n)==0){
        //  System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was one");
        // }
   
        // set bit
    //    int n=5;
    //    int pos=1;
    //    int bitmask=1<<pos;
    //     int newNumber=bitmask|n;
    //     System.out.println(newNumber);

        // Clear bit
    //     int n=5;
    //     int pos=2;
    //     int bitmask=1<<pos;
    //    int notBitmask=~bitmask;
    //    int newNumber=n&notBitmask;
    //    System.out.println(newNumber);
 
    //    update bit
    int n=5;
    int pos=2;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter oper:");
    int oper=sc.nextInt();
    if (oper==1){
        int bitmask=1<<pos;
    int newNumber=bitmask|n;
    System.out.println(newNumber);
    }
    else{
         int bitmask=1<<pos;
         int bitwiseNot=~bitmask;
        int newNumber=bitwiseNot&n;
        System.out.println(newNumber);
    }
    sc.close();
    }
}
