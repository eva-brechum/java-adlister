import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        response.setContentType("text/html");
//        String name = request.getParameter("name");
        PrintWriter out =response.getWriter();
        out.println("<h1>Hello World!<h1>");
    }
}

//Walkthrough solution of bonus
//
//if(name = null) {
//    out.println("Hello World");
// }else {
//    out.println("<h1> Hello, "+ name + "!<h1>");
//        }