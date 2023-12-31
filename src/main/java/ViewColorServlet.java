import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String color = request.getParameter(("color"));
        System.out.println(color);
        request.setAttribute("color", color);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
    }

}
