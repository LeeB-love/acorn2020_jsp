package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sub/fortune") // 반드시 /로 시작하기
public class FortuneServlet extends HttpServlet{ 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req는 요청객체의 참조값 resp는 응답객체의 참조값. 어떤걸 요청할 것인지, 어떤걸 응답할 것인지만 우리가 코딩하면 된다.
		//오늘의 운세를 클라이언트에게 html 형식을 가지고 있는 문자열 형태로 '응답'하는게 목적이니 resp 객체를 사용하면 됩니다.
	
		//응답 인코딩 설정
		resp.setCharacterEncoding("utf-8");
		//응답 컨텐츠 type 설정
		resp.setContentType("text/html;charset=utf-8"); //html 형식으로 응답한다고 명시하는 것
		
		//클라이언트의 웹브라우저에 출력하는 PrintWriter 객체의 참조값 얻어오기 (resp의 기능을 통해서 얻어오는 것!!)
		PrintWriter pw = resp.getWriter();
		
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset = 'utf-8'/>");
		pw.println("<title>fortune 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		
		String[] fortune = {
				"좋을 때도 있는 것처럼 나쁠 때도 있습니다.",
				"불확실한 일은 추진하지 마세요!",
				"어려운 사람을 도우면 좋은 일이 일어날 것입니다.",
				"욕심을 부리다가 오히려 손해를 볼 수 있으니 조심하세요!",
				"노력한 만큼 좋은 성적을 거둘거에요~"
		};
		
		Random ran = new Random();
		int ranF = ran.nextInt(5);
		String f = fortune[ranF];
		
		pw.println("<p> 오늘의 운세  : "+f+"</p>");
		pw.println("<img src = '/Web02_Servlet/images/kim1.png'/>");
		pw.println("</body>");
		pw.print("</html>");
		pw.close();
		
		
		
		
	}
}
