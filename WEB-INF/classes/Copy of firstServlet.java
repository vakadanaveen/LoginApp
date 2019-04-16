//Implementation of the life cycle of a servlet
// 
/* Verify installation and setting of Web container/web Server/Tomcat and prepare an installation report,
 which contains setting of class path, server port, starting and shutting down of server.
 Develop web Application to display a greeting message in the browser by using Servlet interface
*/

/*
Lab Cycle Program Number: 	09
Author					: 	VAKADA NAVEEN
Date 					: 	23/08/2018
Roll Number 			: 	168W1A0556
Description				: 	Implementation of servlet
Software required 		: 	Java Software(JDK and JRE)
							Java EditorKit
							Apache Tomcat web server 8.5
							Browser software
Topics covered 			: 	Step 1: Download and install tomcat 8.5 
							Step 2: Create an environment variable JAVA_HOME
							Step 3: Configure tomcat web server
									a. Modify server.xml
									b. Modify context.xml
							Step 4: Start Tomcat web server
							Step 5: a. Start a browser of a client to access the home page of tomcat web server.
									b. Shutdown the web server.
									Reference: C:\Program Files\Apache Software Foundation\Tomcat 8.5\bin
							Step 6: Develop and deploy your first servlet in Tomcat web server.
									a. Develop a servlet:
										i)Create a directory structure under Tomcat for your application.
										ii)Write the servlet source code.
										iii)Compile a servlet source code.
											Download servlet API jar file and setup in jdk environment
											Reference: C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext
										iv)Create a deployment descriptor file(web.xml). (Deployment of servlet in tomcat web server)
										v)Start Tomcat web server
										vi)Call your servlet from a web browser.
							Creating a servlet by implementing Servlet interface from javax.servlet package
							Life Cycle of a servlet
*/

//Load the required packages
import javax.servlet.*;  //For implementing servlet source code
import java.io.*;  //For performing reading and writing of data between client and server


	
//Define main class
public class firstServlet implements Servlet {
	//Life Cycle of a servlet
	//1.Instantiation phase
	//2.Initialization phase
	public void init(ServletConfig config){
		
	}
	//3.Servicing phase
	public void service(ServletRequest req,ServletResponse res){
		
	}
	//4.Destruction phase
}