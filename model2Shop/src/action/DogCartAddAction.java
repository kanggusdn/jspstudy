package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.DogCardAddService;
import vo.ActionForward;
import vo.Dog;

public class DogCartAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DogCardAddService dogCardAddService = new DogCardAddService();
		int id = Integer.parseInt(request.getParameter("id"));
		Dog cartDog = dogCardAddService.getCartDog(id);
		dogCardAddService.addCart(request, cartDog);
		ActionForward forward = new ActionForward("dogCartList.do", true);
		
		return forward;
	}

}
