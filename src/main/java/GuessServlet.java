import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/guess.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int userNumber = Integer.parseInt(request.getParameter("guess"));
        int ans =(int) Math.floor((Math.random() * 3) + 1);
        if (userNumber == ans) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }
    }

}

