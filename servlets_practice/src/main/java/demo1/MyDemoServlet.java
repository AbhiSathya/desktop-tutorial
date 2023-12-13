package demo1;
import java.io.*;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyDemoServlet
 */
public class MyDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()+"\n");
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to the server");
		response.setContentType("text/html");
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<style>\r\n"
				+ "    div{ margin:20px;\r\n"
				+ "          padding:20px;\r\n"
				+ "           }\r\n"
				+ "div {\r\n"
				+ "  width: 100px;\r\n"
				+ "  height: 100px;\r\n"
				+ "  position:relative;\r\n"
				+ "  background-color: red;\r\n"
				+ "  animation-name: example;\r\n"
				+ "  animation-duration: 4s;\r\n"
				+ "  animation-delay:1s;\r\n"
				+ "  animation-direction:alternate-reverse;\r\n"
				+ "  animation-iteration-count:2;\r\n"
				+ "  animation-fill-mode: forwards;\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "@keyframes example {\r\n"
				+ "  0%   {background-color:red; left:0px; top:0px;transform:rotate(360deg);}\r\n"
				+ "  25%  {background-color:yellow; left:200px; top:0px;rotate(360deg);}\r\n"
				+ "  50%  {background-color:blue; left:200px; top:200px;rotate(360deg);}\r\n"
				+ "  75%  {background-color:green; left:0px; top:200px;rotate(360deg);}\r\n"
				+ "  100% {background-color:magenta; left:0px; top:0px;rotate(360deg);}\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<h1>CSS Animation Demo</h1>\r\n"
				+ "\r\n"
				+ "<div><img src=\"../images/Msdhoni.jpg\" width=\"100px\" height=\"100px\"></div>\r\n"
				+ "\r\n"
				+ "<p><b>Note:</b> When an animation is finished, it goes back to its original style.Animation-fill-mode can allow to retain.</p>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
