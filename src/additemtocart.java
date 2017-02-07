import java.util.ArrayList;

import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.shopping.Cart;  
import com.shephertz.app42.paas.sdk.java.shopping.Cart.Payment;  
import com.shephertz.app42.paas.sdk.java.shopping.CartService;  
import com.shephertz.app42.paas.sdk.java.shopping.PaymentStatus;  
public class additemtocart {
	public static void additem()
	{
		String cartId = "c3220e94ba337f7d0d61bd56a1c3bffbb49f0e30262df7db29fc9434b420d932";     
		String itemID = "1001";  
		int itemQuantity = 12;  
		double price = 1000;      
	    App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
		CartService cartService = App42API.buildCartService();   
		Cart cart = cartService.addItem(cartId,itemID,itemQuantity,price);   
		System.out.println("cartId is :" + cart.getCartId());    
		ArrayList<Cart.Item> itemList =  cart.getItemList();   
		for(int i=0;i<itemList.size();i++)  
		{  
		    System.out.println("ItemId is"+itemList.get(i).getItemId());  
		    System.out.println("Price "+itemList.get(i).getPrice());  
		    System.out.println("Quantity"+itemList.get(i).getQuantity());  
		    System.out.println("Total Amount"+itemList.get(i).getTotalAmount());  
		}  
		String jsonResponse = cart.toString();   
	}
 public static void main(String args[])
 {
	 additem();
 }
}
