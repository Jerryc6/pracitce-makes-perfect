import java.util.Scanner;

public class code{
	
	public void login(){
	  /*in this block is the function BLOCK*/
	  Scanner sc = new Scanner(System.in);
	  System.out.println("LOGIN");

	  String user = "Jerryc";
	  System.out.println("Username: ");
	  String input = sc.nextLine();
	  
	  String key = "1234";
	  System.out.println("Password: ");
	  String pass = sc.nextLine();

	  String in = "Successfull";

	  if(user.equals(input) && pass.equals(key)){
	  	System.out.println(in);
	  }else{
	  	System.out.println("exit(0)");
	  }

	}
	
	public static void main (String[]args){
		String createAcc = "Don't have account? Press [+] to create";
		System.out.println("Hello Client "+createAcc);
		code c = new code();
		c.login();	
	}
}
