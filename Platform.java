import java.time.LocalDateTime;

public class Platform {
    private int platform_id;
    private String platform_name;
    private String platform_version;
    private String country_of_origin;
    private LocalDateTime release_date;

    // Constructor
    public Platform(int platform_id, String platform_name, String platform_version, String country_of_origin, LocalDateTime release_date){
        this.platform_id = platform_id;
        this.platform_name = platform_name;
        this.platform_version = platform_version;
        this.country_of_origin = country_of_origin;
        this.release_date = release_date;
    }

    // Getters and setters for each field
    public int getPlatformId(){
        return platform_id;
    }

    public void setPlatformId(int platform_id){
        this.platform_id = platform_id;
    }

    public String getPlatformName(){
        return platform_name;
    }

    public void setPlatformName(String platform_name){
        this.platform_name = platform_name;
    }

    public String getPlatformVersion(){
        return platform_version;
    }

    public void setPlatformVersion(String platform_version){
        this.platform_version = platform_version;
    }

    public String getCountryOfOrigin(){
        return country_of_origin;
    }

    public void setCountryOfOrigin(String country_of_origin){
        this.country_of_origin = country_of_origin;
    }

    public LocalDateTime getReleaseDate(){
        return release_date;
    }

    public void setReleaseDate(LocalDateTime release_date){
        this.release_date = release_date;
    }

    @Override
    public String toString() {
    return "Platform{" +
            "platform_id=" + platform_id +
            ", platform_name='" + platform_name + '\'' +
            ", platform_version='" + platform_version + '\'' +
            ", country_of_origin='" + country_of_origin + '\'' +
            ", release_date=" + release_date +
            '}';
}

}
