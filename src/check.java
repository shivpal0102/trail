import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.ServiceAPI;
import com.shephertz.app42.paas.sdk.java.session.Session;
import com.shephertz.app42.paas.sdk.java.user.User;  
import com.shephertz.app42.paas.sdk.java.user.User.Profile;  
import com.shephertz.app42.paas.sdk.java.user.User.UserGender;  
import com.shephertz.app42.paas.sdk.java.user.UserService; 
import java.io.*;
import java.lang.*;
import org.json.*;

public class check {
	public static void main(String[] args) {
		
	
	App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d"); 
   // ServiceAPI serviceAPI = new ServiceAPI("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");  
	String userName = "shiv";
	String pwd = "1234"; 
	String emailId = "shivpal@shephertz.co.in"; 
	UserService userService = App42API.buildUserService(); 
	User user = userService.createUser(userName, pwd, emailId);
	System.out.println("userName is " + user.getUserName());
	System.out.println("emailId is " + user.getEmail());
	String jsojnResponse = user.toString();
	System.out.println(jsojnResponse);
	
}}
