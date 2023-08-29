import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ServeOutcomeLoose", urlPatterns = "/incorrect")

public class ServeOutcomeLoose extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        boolean userguess = false;
        request.setAttribute("userguess", userguess);
        request.getRequestDispatcher("/outcome.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean userguess = false;
        req.setAttribute("userguess", userguess);
        req.getRequestDispatcher("/outcome.jsp").forward(req, resp);
    }
}
