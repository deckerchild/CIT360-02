/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

/**
 *
 * @author mount
 */
// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {
 
   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello World";
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
       
      // read form fields
      String username = request.getParameter("username");
      String password = request.getParameter("password");
         
      System.out.println("username: " + username);
      System.out.println("password: " + password);
        
        
      // Set response content type
      response.setContentType("text/html");

      // build HTML code
      String htmlRespone = "<html>";
      htmlRespone += "<h2>Your username is: " + username + "<br/>";      
      htmlRespone += "Your password is: " + password + "</h2>";    
      htmlRespone += "</html>";
   }

   public void destroy() {
      // do nothing.
   }
}
