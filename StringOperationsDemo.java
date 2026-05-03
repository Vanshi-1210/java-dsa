// Program demonstrating basic string operations in Java
// import java.util.*;
public class StringOperationsDemo {
    public static void main(String[] args) {
        // string Declaration
        // String FullName="Vanshika Agrawal";
        // String Sentence="My name is Vanshika Agrawal";
        // System.out.println(FullName);
        // System.out.println(Sentence);
        // // String input
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your name here:");
        // String name=sc.nextLine();
        // System.out.println(name);
        // sc.close();

    //     String concatenation
    String FirstName="Kratika";
    String LastName="Agrawal";
    String FullName=FirstName+" "+LastName;
    System.out.println(FullName);
    // System.out.println(FullName.length());
    // CharAt method 
    for(int i=0;i<FullName.length();i++){
        System.out.println(FullName.charAt(i));
    }
  
    //   String Comparison
    String name1="vanshika";
    String name2="Hardik";
    if(name1.compareTo(name2)==0){
        System.out.println("Strings are equal");
    }
    else if(name1.compareTo(name2)>0){
        System.out.println("String 1 is bigger");
    }
    else{
        System.out.println("String 2 is bigger");
    }

    //  String Substring
     String sentence="Hello i am VANSHIKA";
    String name=sentence.substring(11);
    System.out.println(name);
     String part=sentence.substring(0,5);
     System.out.println(part);
    //  sc.close();
     }
}


