import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String A = sc.next(); 
         String reverse = ""; 

       
            for(int j =A.length()-1; j>=0; j--){ 
              reverse += A.charAt(j); 
              
            } 
            if (reverse.equals(A) ) {
                System.out.println("Yes, its a palindrome.");
               } else{ 
                System.out.println("This is not a palindrome");
               }
        } 
        
    }

