import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.gift.Gift;  
import com.shephertz.app42.paas.sdk.java.gift.GiftService;  
public class creategift {
 public static void creategift()
 {
	 String giftName = "Power";  
	 String icon = "C:\\Users\\Pulvin\\Desktop\\anicon";    
	 String displayName = "Power Up";  
	 String description = "Gift is created in App42 DataBase.";  
	 String tagName = "Entertainment";  
	  App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
  
	 GiftService giftService = App42API.buildGiftService();   
	 Gift gift = giftService.createGift(giftName, icon, displayName, description, tagName);  
	 System.out.println("Gift Name is : " + gift.getName());  
	 System.out.println("Display name is : " + gift.getDisplayName());  
	 System.out.println("Icon url is : " + gift.getIcon());  
	 System.out.println("Description is : " + gift.getDescription());  
	 System.out.println("Created on is : " + gift.getCreatedOn());  
	 System.out.println("Tag is : " + gift.getTag());
 }
 public static void main(String args[])
 {
	  creategift();
 }
}
