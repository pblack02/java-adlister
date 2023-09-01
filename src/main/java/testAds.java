import java.sql.SQLException;

public class testAds {
    public static void main(String[] args) throws SQLException {
        MySQLAdsDao adsDao = new MySQLAdsDao(new Config());
        Ad ad = new Ad(1, "IT", "about the world of IT");
        int lastInsertID = Math.toIntExact(adsDao.insert(ad));
        System.out.println(lastInsertID);


    }
}
