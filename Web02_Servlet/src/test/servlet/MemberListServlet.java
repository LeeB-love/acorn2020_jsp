package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dto.MemberDto;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet{
	 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //DB에서 부러온 회원 목록이라고 가정하자
		 List<MemberDto> list = new ArrayList<>();
		 list.add(new MemberDto(1, "김구라", "노량진"));
		 list.add(new MemberDto(2, "해골", "행신동"));
		 list.add(new MemberDto(3, "원숭이", "상도동"));
		 
		//응답 인코딩 설정
			resp.setCharacterEncoding("utf-8");
			//응답 컨텐츠 type 설정
			resp.setContentType("text/html;charset=utf-8"); //html 형식으로 응답한다고 명시하는 것
			
			PrintWriter pw = resp.getWriter();
			pw.println("<!doctype html>");
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<meta charset = 'utf-8'/>");
			pw.println("<title>회원 목록 페이지</title>");
			pw.println("<link rel='stylesheet' href='/Web02_Servlet/css/bootstrap.css'/>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<div class = 'container'>");
			pw.println("<h1>회원 목록 입니다.</h1>");
			pw.println("<table class='table'>");
				pw.println("<tr>");
					pw.println("<th>번호</th>");
					pw.println("<th>이름</th>");
					pw.println("<th>주소</th>");
				pw.println("</tr>");
				
				for(MemberDto tmp : list) {
					pw.println("<tr>");
						pw.println("<td>"+tmp.getName()+"</td>");
						pw.println("<td>"+tmp.getNum()+"</td>");
						pw.println("<td>"+tmp.getAddr()+"</td>");
					pw.println("</tr>");
				}
			pw.println("</table>");
			pw.println("</div>");
			pw.println("</body>");
			pw.print("</html>");
			pw.close();
		 
	}
}
