import java.time.LocalDateTime;

public class User {
    private int user_id;
    private int platform_id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private LocalDateTime join_date;
    private Boolean is_private;

    // Contructor
    public User(int user_id, int platform_id, String username, String first_name, String last_name, String email, LocalDateTime join_date, Boolean is_private){
        this.user_id = user_id;
        this.platform_id = platform_id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.join_date = join_date;
        this.is_private = is_private;
    }

    // Getters and setters for each field
    public int getUserID(){
        return this.user_id;
    }

    public void setUserId(int user_id){
        this.user_id = user_id;
    }

    public int getPlatformId(){
        return this.platform_id;
    }

    public void setPlatformId(int platform_id){
        this.platform_id = platform_id;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getFirstName(){
        return this.first_name;
    }

    public void setFirstName(String first_name){
        this.first_name = first_name;
    }

    public String getLastName(){
        return this.last_name;
    }

    public void setLastName(String last_name){
        this.last_name = last_name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDateTime getJoinDate(){
        return this.join_date;
    }

    public void setJoinDate(LocalDateTime join_date){
        this.join_date = join_date;
    }

    public Boolean getIsPrivate(){
        return this.is_private;
    }

    public void setIsPrivate(Boolean is_private){
        this.is_private = is_private;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", platform_id=" + platform_id +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", join_date=" + join_date +
                ", is_private=" + is_private +
                '}';
    }    


}
