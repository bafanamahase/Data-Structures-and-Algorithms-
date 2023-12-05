import java.util.Scanner;
public class PalindromeTest
{  
 public static void main(String[] args) 
 {
     MyLinkedList<String> myList = new MyLinkedList<>();
     String s, str = "";

     Scanner a = new Scanner(System.in);
     System.out.print("Enter a string that you want to check: ");
      s = a.nextLine();

  
     int l = s.length();
  
     for(int i = l - 1; i >= 0; i--)
     {
        str = str + s.charAt(i);
      }
 
     if(s.equalsIgnoreCase(str))
           System.out.println("String " +str+ " True.");
     else
          System. out.println("String " +str+ " False.");
 }
}