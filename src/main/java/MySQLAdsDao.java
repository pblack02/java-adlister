import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
    }

    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * from ads");
        while (rs.next()){
            ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
        }
        return ads;

    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        Statement statement = connection.createStatement();
        String insertQuery = String.format("INSERT INTO ads (user_id, title,description) VALUES(%d, '%s', '%s');",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
        );
        statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()){
            System.out.println("Inserted a new ad! New id: " + rs.getLong(1));
        }
        return rs.getLong(1);
    }
}
