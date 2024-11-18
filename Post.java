import java.time.LocalDateTime;

public class Post {
    private int post_id;
    private int user_id;
    private int like_count;
    private int comment_count;
    private int share_count;
    private LocalDateTime post_date;
    private PostVisibility visibility;

    // Constructor
    public Post(int user_id, int like_count, int comment_count, int share_count, LocalDateTime post_date, PostVisibility visibility) {
        this.user_id = user_id;
        this.like_count = like_count;
        this.comment_count = comment_count;
        this.share_count = share_count;
        this.post_date = post_date;
        this.visibility = visibility;
    }

    // Getters and setters for each field
    public int getPostId() {
        return post_id;
    }

    public void setPostId(int post_id) {
        this.post_id = post_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getLikeCount() {
        return like_count;
    }

    public void setLikeCount(int like_count) {
        this.like_count = like_count;
    }

    public int getCommentCount() {
        return comment_count;
    }

    public void setCommentCount(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getShareCount() {
        return share_count;
    }

    public void setShareCount(int share_count) {
        this.share_count = share_count;
    }

    public LocalDateTime getPostDate() {
        return post_date;
    }

    public void setPostDate(LocalDateTime post_date) {
        this.post_date = post_date;
    }

    public PostVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(PostVisibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", user_id=" + user_id +
                ", like_count=" + like_count +
                ", comment_count=" + comment_count +
                ", share_count=" + share_count +
                ", post_date=" + post_date +
                ", visibility='" + visibility + '\'' +
                '}';
    }
    
}
