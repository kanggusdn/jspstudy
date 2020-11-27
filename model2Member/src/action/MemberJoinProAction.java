package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.MemberJoinProService;
import vo.ActionForward;
import vo.MemberBean;

public class MemberJoinProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberBean member = new MemberBean();
		boolean joinResult = false;
		
		member.setAge(Integer.parseInt(request.getParameter("age")));
		member.setEmail(request.getParameter("email"));
		member.setGender(request.getParameter("gender"));
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setPw(request.getParameter("pw"));
		
		MemberJoinProService memberJoinProService = new MemberJoinProService();
		joinResult = memberJoinProService.joinMember(member);
		
		ActionForward forward = null;
		if(joinResult) {
			forward = new ActionForward("memberLogin.do", true);
		} else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('회원등록실패');history.back();</script>");
		}
		
		return forward;
	}

}
