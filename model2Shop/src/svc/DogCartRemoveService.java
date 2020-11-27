package svc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import vo.Cart;

public class DogCartRemoveService {

	public void cartRemove(HttpServletRequest request, String[] kindArray) {
		HttpSession session = request.getSession();
		ArrayList<Cart> cartList = (ArrayList<Cart>)session.getAttribute("cartList");
		if(kindArray == null) return;
		for(int i = 0; i<cartList.size(); i++) {
			if(cartList.get(i).getKind().equals(kindArray[i])) {
				cartList.remove(cartList.get(i));
			}
		}
	}
}
