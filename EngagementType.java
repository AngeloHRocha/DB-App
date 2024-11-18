public class EngagementType {
    private int engagement_type_id;
    private String type_name;
    private Boolean contains_text;

    // Constructor
    public EngagementType(int engagement_type_id, String type_name, Boolean contains_text) {
        this.engagement_type_id = engagement_type_id;
        this.type_name = type_name;
        this.contains_text = contains_text;
    }

    // Getter and Setter methods
    public int getEngagementTypeId() {
        return engagement_type_id;
    }

    public void setEngagementTypeId(int engagement_type_id) {
        this.engagement_type_id = engagement_type_id;
    }

    public String getTypeName() {
        return type_name;
    }

    public void setTypeName(String type_name) {
        this.type_name = type_name;
    }

    public Boolean getContainsText() {
        return contains_text;
    }

    public void setContainsText(Boolean contains_text) {
        this.contains_text = contains_text;
    }

    @Override
    public String toString() {
        return "EngagementType{" +
                "engagement_type_id=" + engagement_type_id +
                ", type_name='" + type_name + '\'' +
                ", contains_text=" + contains_text +
                '}';
    }
}
