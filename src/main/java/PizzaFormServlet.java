import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(urlPatterns = "/pizza-order")
public class PizzaFormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-form").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter(("crust"));
        String sauce = request.getParameter(("sauce"));
        String size = request.getParameter(("size"));
        String toppings = request.getParameter("toppings");
        String address = request.getParameter("address");
        System.out.printf("Size: %s%n Crust: %s%n Sauce: %s%n Toppings: %s%n Address: %S%n", size, crust, sauce, toppings, address);
    }
}

