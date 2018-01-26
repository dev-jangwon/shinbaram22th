package shinbaram.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonalController")
public class PersonalController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("/video.html");
//		rd.forward(request, response);
//		PrintWriter writer = response.getWriter();
//		JSONObject resultOb = new JSONObject();
		
//		try {
//			ArrayList<TopicDTO> list = RealtimesService.get10Topic();
//			String stringList = new Gson().toJson(list);
//			resultOb.put("result", 0);
//			resultOb.put("list", stringList);
//		} catch (SQLException e) {
//			resultOb.put("result", 1);
//			resultOb.put("content", "Can`t get News Contents(DB Error)");
//			e.printStackTrace();
//		}
//		resultOb.put("result", 1);
//		writer.print(resultOb);
		response.sendRedirect("video.html");
		return;
	}
}
