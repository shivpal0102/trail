import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.shephertz.app42.paas.sdk.java.App42API;
import com.shephertz.app42.paas.sdk.java.user.User;
import com.shephertz.app42.paas.sdk.java.user.UserService;


public class user  {
	
	
    public String getUsrNm() throws IOException 
       { 
	System.out.println("enter your name ");
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
	String userName =br.readLine();
	return userName;
       }
    public String getUserPass() throws IOException
    {  
    	System.out.println("enter your pass");
    	InputStreamReader r=new InputStreamReader(System.in);  
    	BufferedReader br=new BufferedReader(r);
    	String pass =br.readLine();
    	return pass;
    }
    public String getUserMail() throws IOException
    {  
    	System.out.println("enter your mail");
    	InputStreamReader r=new InputStreamReader(System.in);  
    	BufferedReader br=new BufferedReader(r);
    	String mail =br.readLine();
    	return mail;
    }
    public String userInput() throws IOException
    {  
    	System.out.println("enter your choice");
    	InputStreamReader r=new InputStreamReader(System.in);  
    	BufferedReader br=new BufferedReader(r);
    	String choice =br.readLine();
    	return choice;
    }
	public static void createSimpleUser(String username,String pass,String mail)
    	{
		String userName1 =username;
		String pwd =pass ;
		String emailId = mail; 
		UserService userService = App42API.buildUserService(); 
		User user = userService.createUser(userName1, pwd, emailId);
		System.out.println("userName is " + user.getUserName());
		System.out.println("emailId is " + user.getEmail());
		String jsojnResponse = user.toString();
		System.out.println(jsojnResponse);
	}
	public static void Authenticate(String un,String pass)
	{
		String userName =un;  
		String pwd = pass;     
		//App42API.initialize("API_KEY","SECRET_KEY");  
		UserService userService = App42API.buildUserService();   
		User user = userService.authenticate(userName, pwd);   
		System.out.println("userName is " + user.getUserName());    
		System.out.println("sessionId is " + user.getSessionId());    
		
	}
	
	public static void createUserWithRole(String username,String pass,String mail)
	{   String userName=username;
	    String pwd=pass;
	    String emailId=mail;
		ArrayList<String> roleList = new ArrayList<String>();  
		roleList.add("Admin");  
		roleList.add("Manager");  
		roleList.add("Programmer");  
		roleList.add("Tester");   
		App42API.initialize("API_KEY","SECRET_KEY");  
		UserService userService = App42API.buildUserService();   
		User user = userService.createUser(userName, pwd, emailId,roleList);   
		System.out.println("userName is " + user.getUserName());    
		System.out.println("emailId is " + user.getEmail());    
		String jsonResponse = user.toString();   
	}
	public static void main(String args[]) throws IOException
	{   App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d"); 
		user u=new user();
		/*System.out.println("Enter your choice from the following list");
		ArrayList<String> roleList = new ArrayList<String>();  
		roleList.add("Create User");  
		roleList.add("Create User With Role");  
		roleList.add("Create User With Role");  
		roleList.add("Create/Update User Profile");*/
	/*	
		String un=u.getUsrNm();
		String upass=u.getUserPass();
		String	mail=u.getUserMail();	
		*/
	//	createSimpleUser(un,upass,mail);
		Authenticate("shiv11","1234");
	//	createUserWithRole(un,upass,mail);
	
		
		
	}
	}
   
 
