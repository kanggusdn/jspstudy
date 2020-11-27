package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import svc.MemberLoginProService;
import vo.ActionForward;
import vo.MemberBean;

public class MemberLoginProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		MemberBean member = new MemberBean();
		member.setId(request.getParameter("id"));
		member.setPw(request.getParameter("pw"));
		
		MemberLoginProService memberLoginProService = new MemberLoginProService();
		boolean loginResult = memberLoginProService.login(member);
		ActionForward forward = null;
		if(loginResult) {
			session.setAttribute("id", member.getId());
			forward = new ActionForward("memberList.do", true);
		}
		
		return forward;
	}

}
