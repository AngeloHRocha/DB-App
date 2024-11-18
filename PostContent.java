public class PostContent {
    private int content_id;
    private String title;
    private String content;
    private float file_size;
    private int post_id;
    private int type_id;

    // Constructor
    public PostContent(int content_id, String title, String content, float file_size, int post_id, int type_id) {
        this.content_id = content_id;
        this.title = title;
        this.content = content;
        this.file_size = file_size;
        this.post_id = post_id;
        this.type_id = type_id;
    }

    // Getter and Setter methods
    public int getContentId() {
        return content_id;
    }

    public void setContentId(int content_id) {
        this.content_id = content_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getFileSize() {
        return file_size;
    }

    public void setFileSize(float file_size) {
        this.file_size = file_size;
    }

    public int getPostId() {
        return post_id;
    }

    public void setPostId(int post_id) {
        this.post_id = post_id;
    }

    public int getTypeId() {
        return type_id;
    }

    public void setTypeId(int type_id) {
        this.type_id = type_id;
    }

    @Override
    public String toString() {
        return "PostContent{" +
                "content_id=" + content_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", file_size=" + file_size +
                ", post_id=" + post_id +
                ", type_id=" + type_id +
                '}';
    }
}
