// Program demonstrating basic StringBuilder operations in Java
public class StringBuilderOperations {
    public static void main(String[] args) {
        // // Declaration
        StringBuilder sb=new StringBuilder("Saloni");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // // set character
        sb.setCharAt(0, 'K');
        System.out.println(sb);
        // // insert
        sb.insert(0, 'H');
        System.out.println(sb);
        // // Delete
        sb.delete(0, 4);
        System.out.println(sb);
        // // Append
        sb.append("srivastava");
        System.out.println(sb);
        // // length
        System.out.println(sb.length());
        // reverse a string
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
    }
    System.out.println(sb);
        }
}
