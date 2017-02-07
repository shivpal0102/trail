import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.buddy.Buddy;  
import com.shephertz.app42.paas.sdk.java.buddy.BuddyService;  
public class buddyservice {
   public static void sendfrndrqst()
   {
	   String userName = "shiv1";  
	   String buddyName  = "shiv";  
	   String message = "Welcome to Shephertz";  
		  App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
	   BuddyService buddyService = App42API.buildBuddyService();   
	   Buddy buddy = buddyService.sendFriendRequest(userName, buddyName, message);  
	   System.out.println("userName is : " + buddy.getUserName());   
	   System.out.println("buddyName is : " + buddy.getBuddyName());   
	   System.out.println("message is : " + buddy.getMessage());   
	   System.out.println("sendedOn is : " + buddy.getSendedOn());
   }
   public static void main(String[] args) {
	sendfrndrqst();
}
}
