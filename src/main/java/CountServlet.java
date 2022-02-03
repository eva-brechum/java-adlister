import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name ="CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int count;

    public void init() {
        count = 0;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        count++;
        PrintWriter out = response.getWriter();
        out.println("<h2 align = \"center\">" + count + "<h2>\n");
    }
}

//Walkthrough solution bonus
//String reset = request.getParameter("reset");
//if(reset == null){
//        out.println("<h2 align = \"center\">" + count + "<h2>\n");
//        }else{
//        count=0;
//        out.println("<h2 align = \"center\">" + count + "<h2>\n")
//        }
//        }