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
public class paymentbyuser {
	public static void additem()
	{
		String cartId = "c3220e94ba337f7d0d61bd56a1c3bffbb49f0e30262df7db29fc9434b420d932";     
	    App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
		CartService cartService = App42API.buildCartService();   
		Cart cart = cartService.checkOut(cartId);   
		System.out.println("cartId is :" + cart.getCartId());   
		System.out.println("State is:"+cart.getState());  
		String jsonResponse = cart.toString();   
	}
 public static void main(String args[])
 {
	 additem();
 }
}