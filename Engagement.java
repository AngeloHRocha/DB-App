import java.time.LocalDateTime;

public class Engagement {
    private int engagement_id;
    private int post_id;
    private int user_id;
    private int engagement_type_id;
    private String engagement_content;
    private LocalDateTime engagement_date;

    // Constructor
    public Engagement(int engagement_id, int post_id, int user_id, int engagement_type_id, String engagement_content, LocalDateTime engagement_date) {
        this.engagement_id = engagement_id;
        this.post_id = post_id;
        this.user_id = user_id;
        this.engagement_type_id = engagement_type_id;
        this.engagement_content = engagement_content;
        this.engagement_date = engagement_date;
    }

    // Getter and Setter methods
    public int getEngagementId() {
        return engagement_id;
    }

    public void setEngagementId(int engagement_id) {
        this.engagement_id = engagement_id;
    }

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

    public int getEngagementTypeId() {
        return engagement_type_id;
    }

    public void setEngagementTypeId(int engagement_type_id) {
        this.engagement_type_id = engagement_type_id;
    }

    public String getEngagementContent() {
        return engagement_content;
    }

    public void setEngagementContent(String engagement_content) {
        this.engagement_content = engagement_content;
    }

    public LocalDateTime getEngagementDate() {
        return engagement_date;
    }

    public void setEngagementDate(LocalDateTime engagement_date) {
        this.engagement_date = engagement_date;
    }

    @Override
    public String toString() {
        return "Engagement{" +
                "engagement_id=" + engagement_id +
                ", post_id=" + post_id +
                ", user_id=" + user_id +
                ", engagement_type_id=" + engagement_type_id +
                ", engagement_content='" + engagement_content + '\'' +
                ", engagement_date=" + engagement_date +
                '}';
    }
}
