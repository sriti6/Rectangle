
import java.util.Scanner;


public class verify {
       public static void main (String [] args){
       
         String username,password;

	 System.out.println("Enter your username");
	 Scanner keyboard = new Scanner(System.in);
	 username = keyboard.nextLine();


	 System.out.println("Enter your password");

	 Scanner keyboard1 = new Scanner (System.in);
	 password = keyboard1.nextLine();


	   if ((username.equals("sriti7")) && (password.equals("cutegirl"))){
		    System.out.println("welcome username:sriti7 & password:cutegirl");
		      
	   }else{
		   System.out.println("wrong username & password");

		      }
	


	
       
       
       
       
       }





}

