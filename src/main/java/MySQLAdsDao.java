import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> allAds = new ArrayList<>();
        try {
            Statement stat = connection.createStatement();
            String query = "SELECT * FROM ads";
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                Ad newAd = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                allAds.add(newAd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allAds;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stat = connection.createStatement();
            String insertQuery = "INSERT INTO ads(user_id, title, description) VALUES "
                    + "(" + ad.getUserId() + ", " +
                    "" + ad.getTitle() + ad.getDescription() + ")";
            stat.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stat.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Creating new add leads to error", e);
        }
    }

}