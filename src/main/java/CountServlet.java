import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/count")
public class CountServlet extends HttpServlet{
    public static int count =0;
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String reset = request.getParameter("reset");
            if (reset != null){
                count = 0;
                response.getWriter().println("You've reset the count! " + count);
            } else {
                response.getWriter().println("Your current count is " + count++);
            }
        }

}
