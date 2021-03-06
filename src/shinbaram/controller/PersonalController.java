package shinbaram.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@WebServlet("/PersonalController")
public class PersonalController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
			
		String name = "";
		String birth = "";
		
		if((String) request.getParameter("name") != null) {
			name = (String) request.getParameter("name");
		}
		if((String) request.getParameter("birth") != null) {
			birth = (String) request.getParameter("birth");
		}
		
		System.out.println(name + birth);
		
		String ment = "";
		String url = "";
		String imgUrl = "";
		String tmpName = "";
		String tmpBirth = "";

		try {

			File fXmlFile = new File(getServletContext().getRealPath("shinbaram.xml"));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("member");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					
					tmpName = "";
					tmpBirth = "";
					if(eElement.getElementsByTagName("name").item(0).getTextContent() != null) {
						tmpName = eElement.getElementsByTagName("name").item(0).getTextContent();
					}
					
					if(eElement.getElementsByTagName("birth").item(0).getTextContent() != null) {
						tmpBirth = eElement.getElementsByTagName("birth").item(0).getTextContent();
					}
					
					if (name.equals(tmpName) && birth.equals(tmpBirth)) {
						ment = eElement.getElementsByTagName("ment").item(0).getTextContent();
						url = eElement.getElementsByTagName("url").item(0).getTextContent();
						imgUrl = birth + "_" + name + ".jpg";
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("url", url);
		request.getSession().setAttribute("ment", ment);
		request.getSession().setAttribute("imgUrl", imgUrl);

		if (url != null && !url.equals("")) {
			response.sendRedirect("video.jsp");
		} else {
			response.sendRedirect("main.html");
		}
		
		return;
	}
}
