import java.util.ArrayList;

import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.email.Email;  
import com.shephertz.app42.paas.sdk.java.email.EmailMIME;  
import com.shephertz.app42.paas.sdk.java.email.EmailService;
public class emailservices {
	public static void cofigue()
	{    
		String emailHost = "shi@ga.com";  
		int emailPort = 465;  
		String emailId = "shivpal@shephertz.co.in";  
		String password = "shivpal";  
		boolean isSSL = true;                         
	    App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
		EmailService emailService = App42API.buildEmailService();   
		Email email =  emailService.createMailConfiguration(emailHost,emailPort,emailId,password,isSSL);  
		ArrayList<Email.Configuration> configList = email.getConfigList();       
		for(Email.Configuration  config : configList)    
		{      
		    System.out.println("emailId is " + config.getEmailId());    
		    System.out.println("Host is " + config.getHost());    
		    System.out.println("Port is " + config.getPort());       
		    System.out.println("SSL is " + config.getSsl());   
		}   
		String jsonResponse = email.toString();  
	}
	public static void send(){
		String sendTo = "shivpal11singh@gmail.com";  
		String sendSubject  = "Feedback";  
		String sendMsg = "a test of apphq";
		String senderEmailId = "shivpal@shephertz.co.in";      
		EmailMIME emailMime=EmailMIME.PLAIN_TEXT_MIME_TYPE;           
	    App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
		EmailService emailService = App42API.buildEmailService();   
		Email emailObject =  emailService.sendMail(sendTo, sendSubject, sendMsg, senderEmailId,emailMime);  
		System.out.println("Email From is : " +emailObject.getFrom());  
		System.out.println("email To is : " +emailObject.getTo());  
		System.out.println("Subject is : " + emailObject.getSubject());  
		System.out.println("Message Body is : " + emailObject.getBody());  
		String jsonResponse = emailObject.toString();  
	}
public static void main(String args[])
{
	//cofigue();
	send();
	
}
}
