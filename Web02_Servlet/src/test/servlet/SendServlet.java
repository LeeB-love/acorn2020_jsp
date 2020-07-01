package test.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class SendServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//한글이 깨지지 않도록 요청 인코딩 설정
		req.setCharacterEncoding("utf-8");
		
		//클라이언트가 작성한 문자열은 req 객체를 이용하여 받을 수 있다.
		String result=req.getParameter("msg"); //input의 name이 msg이므로 msg를 전달해야한다.
		//전송된 value 값을 콘솔창에 출력해보기
		System.out.println("msg : "+result);
		
		PrintWriter pw = resp.getWriter();
		pw.println("ok~");
		pw.close();
		
	}
}
