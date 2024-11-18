public class ContentType {
    private int type_id;
    private String content_type;
    private int max_file_size_gb;

    // Constructor
    public ContentType(int type_id, String content_type, int max_file_size_gb) {
        this.type_id = type_id;
        this.content_type = content_type;
        this.max_file_size_gb = max_file_size_gb;
    }

    // Getter and Setter methods
    public int getTypeId() {
        return type_id;
    }

    public void setTypeId(int type_id) {
        this.type_id = type_id;
    }

    public String getContentType() {
        return content_type;
    }

    public void setContentType(String content_type) {
        this.content_type = content_type;
    }

    public int getMaxFileSizeGb() {
        return max_file_size_gb;
    }

    public void setMaxFileSizeGb(int max_file_size_gb) {
        this.max_file_size_gb = max_file_size_gb;
    }

    @Override
    public String toString() {
        return "ContentType{" +
                "type_id=" + type_id +
                ", content_type='" + content_type + '\'' +
                ", max_file_size_gb=" + max_file_size_gb +
                '}';
    }
}
