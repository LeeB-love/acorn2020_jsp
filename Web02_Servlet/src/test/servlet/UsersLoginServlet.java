package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/Login")
public class UsersLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//응답 인코딩 설정
		resp.setCharacterEncoding("utf-8");
		//응답 컨텐츠 type 설정
		resp.setContentType("text/html;charset=utf-8"); 
		PrintWriter pw = resp.getWriter();
		
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset = 'utf-8'/>");
		pw.println("<title>로그인페이지</title>");
		pw.println("<link rel='stylesheet' href='/Web02_Servlet/css/bootstrap.css'/");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<div class='container'>");
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");

		if(id.equals("gura") && pwd.equals("1234")) {
			pw.println("<p class='alert alert-success'>"+ id +"님 로그인 되었습니다.</p>");
		}else {
			pw.println("<p class='alert alert-danger'> 아이디 혹은 비밀번호가 틀렸습니다 ㅠ </p>");
		}
		pw.println("</div>");
		pw.println("</body>");
		pw.print("</html>");
		pw.close();
	}
}
