import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.shopping.Cart;  
import com.shephertz.app42.paas.sdk.java.shopping.Cart.Payment;  
import com.shephertz.app42.paas.sdk.java.shopping.CartService;  
import com.shephertz.app42.paas.sdk.java.shopping.PaymentStatus;  
public class cartservice {
	public static void mkcart()
	{
		String userName = "shiv11";     
	    App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
		CartService cartService = App42API.buildCartService();   
		Cart cart = cartService.createCart(userName);   
		System.out.println("userName is " + cart.getUserName());    
		System.out.println("cartId is " + cart.getCartId());    
		System.out.println("Cart Session is"+cart.getCartSession());  
		System.out.println("CreationTime is"+cart.getCreationTime());     
		String jsonResponse = cart.toString();   
	}
public static void main(String[] args) {
	mkcart();
}
}
