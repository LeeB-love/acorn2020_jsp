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



@WebServlet("/todo/list")
public class TodoListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//DB에서 읽어온 할 일 목록이라고 가정하자
		List<String> list = new ArrayList<String>();
		list.add("html 공부하기");
		list.add("css 공부하기");
		list.add("javascript 공부하기");
		
		
		//응답 인코딩 설정
				resp.setCharacterEncoding("utf-8");
				//응답 컨텐츠 type 설정
				resp.setContentType("text/html;charset=utf-8"); //html 형식으로 응답한다고 명시하는 것
				
				PrintWriter pw = resp.getWriter();
				pw.println("<!doctype html>");
				pw.println("<html>");
				pw.println("<head>");
				pw.println("<meta charset = 'utf-8'/>");
				pw.println("<title>할일 목록 페이지</title>");
				pw.println("</head>");
				pw.println("<body>");
				pw.println("<h1>오늘 할 일</h1>");
				pw.println("<ul>");
					for(int i=0; i<list.size(); i++) {
						pw.println("<li>"+ list.get(i)+"</li>");
					}
					for(String tmp : list) {
						pw.println("<li>"+ tmp +"</li>");
					} //게시판같은 경우도 반복문 돌면서 리스트에 있는 내용을 테이블 로우로 추가하는 것
				pw.println("</ul>");
				pw.println("</body>");
				pw.print("</html>");
				pw.close();
	}
}
