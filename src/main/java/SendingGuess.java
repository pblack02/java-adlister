import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;


@WebServlet(urlPatterns = "/viewgame")
public class SendingGuess extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/viewgame.jsp").forward(request, response);

    }
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int guess = Integer.parseInt(request.getParameter("guess"));
        if (guess == 2){
            System.out.println(guess);
            response.sendRedirect("/correct");
        } else {
            System.out.println(guess);
            response.sendRedirect("/incorrect");
        }

    }
}
