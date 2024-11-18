import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class PostDAO {

    // Method to insert a new Post into the database
    public void insertPost(Post post) {
        // SQL query to insert the post into the posts table
        String sql = "INSERT INTO posts (user_id, like_count, comment_count, share_count, post_date, visibility) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection(); // Get the connection from the database
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Set the values for the SQL query
            statement.setInt(1, post.getUserId());           
            statement.setInt(2, post.getLikeCount());       
            statement.setInt(3, post.getCommentCount());   
            statement.setInt(4, post.getShareCount());       
            statement.setTimestamp(5, Timestamp.valueOf(post.getPostDate()));
            statement.setString(6, post.getVisibility().name());     

            // Execute the insert statement
            statement.executeUpdate();
            System.out.println("Post inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while inserting the post.");
        }
    }
}
