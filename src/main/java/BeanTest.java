import java.io.Serializable;
import java.util.ArrayList;

public class BeanTest implements Serializable{
    public static void main(String[] args) {

        Album album = new Album("Biscut", "gravet", 2023, (long) 100.50, "Food");
        Author author = new Author("Donalds", "Twitty");
        Quote quote = new Quote( "Get in there!", author);

        System.out.println(album);
        System.out.println(author);
        System.out.println(quote);

    }

}
