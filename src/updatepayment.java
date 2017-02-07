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
public class updatepayment {
	public static void additem()
	{
		String userName = "shiv";  
	    App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
		CartService cartService = App42API.buildCartService();   
		ArrayList<Cart> cart = cartService.getPaymentsByUser(userName);   
		for(int i=0;i<cart.size();i++)  
		{  
		    System.out.println("cartId is :" + cart.get(i).getCartId());    
		    System.out.println("Transaction Id"+cart.get(i).getPayment().getTransactionId());  
		    System.out.println("Total Amount from payment node"+cart.get(i).getPayment().getTotalAmount());  
		    System.out.println("Status"+cart.get(i).getPayment().getStatus());  
		    System.out.println("Date"+cart.get(i).getPayment().getDate());  
		}  
		String jsonResponse = cart.get(0).toString();         
	}
 public static void main(String args[])
 {
	 additem();
 }
}