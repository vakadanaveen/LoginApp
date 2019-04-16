/*Verify installation & setting of Web Container /Web Server/Tomcat and prepare  an installation report, which contains class path,server port
  starting and shutting down of server.
  Develop a web application to display a greeting message in the web browser by using servlet interface.

Program name: RegisterServlet.java

  Lab cycle program no: 09
  Author              : vakada naveen
  Date   			  : 26/7/18
  RollNo			  : 168W1A0556
  Description		  : Implementation of the Life Cycle of Servlet
  Softwares required  : Java software(JDK, JRE), Java Editor, Tomcat web server(8.0), Servlet API(.jar), Browser Software
  Topics covered	  : Creating a servlet by implementing a Servlet interface from javax.servlet package
						1.Downloading & installation of Tomcat 8.0
						2.Creating an Environment variable JAVA_HOME
						3.Configuring Tomcat web server
						   a.server.xml
						   b.context.xml
						4.Starting Tomcat web server
						5.a.Start a browser of a client to access home page of web server
						     (ref : C:\Program Files\Apache Software Foundation\Tomcat 8.5\bin\Tomcatt8w.exe)
						  b.Shut down the web server
						6.Develop and deploy Servlet in Tomcat 
						  a.Develop a Servlet
						    i.Create a directory structure under tomcat for your application
							ii.Write the servlet source code
							iii.Compile the servlet source code
							    Download server api(.jar) file and set up in jdk environment
								(ref: C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext)
							iv.Create a deployment descriptor file(Deployment of servlet in tomcat)
							v.Run tomcat web server
							vi.Call your servlet from a web browser
*/

//Load the required packages							  
import javax.servlet.http.*;    //to implement servlet
import java.io.*;		   //for performing reading and writing of data between client and server
import java.util.*;
import javax.servlet.*;
import java.sql.*;
import oracle.jdbc.driver.*;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Connection con = null;
		Statement stmt = null;
		
		
		String ea = req.getParameter("ea");
		String pwd = req.getParameter("pwd");
		
		
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String uname = "system";
			String pswd = "abc123";
			con = DriverManager.getConnection(url,uname,pswd);
			String sql = "SELECT * FROM REGISTRATION WHERE EA='"+ea+"' AND PWD='"+pwd+"'";
			stmt = con.createStatement();
			int rs = stmt.executeUpdate(sql);
			if(rs>0){
			out.println("<html></style><head><title>Sign in</title>");
out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">");
out.println("</head><body><img src=\"vr.jpg\"><br><br><br>");
out.println("<img src=\"Email.png\" class=\"center\"><br><br><center><h1><font size=\"10\" color=\"green\">Welcome "+ea+" </font></h1></center>");
out.println("</body></html>");
				
			}
			else{
				req.getRequestDispatcher("error.html").include(req,res);
			}
		}
		catch(Exception ex){
           out.println(ex.getMessage());
		}
			
	}
}