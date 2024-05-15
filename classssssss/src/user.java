import java.awt.image.BufferedImage;
//import java.util.ArrayList;

public class user{
    private String name;
    private BufferedImage picture;
    private String bio;
    private String[] friendObjects;
    
    // Default constructor
    public user() {
    }   
    
    // Parameterized constructor
    public user(String name, BufferedImage picture, String bio, String[] friendObjects) {
        this.name = name;
        this.picture = picture;
        this.bio = bio;
        this.friendObjects = friendObjects;
    }
  
    // Getter methods
    public String getName() {
        return name;
    }
 
    public BufferedImage getPicture() {
        return picture;
    }
    
    public String getBio() {
        return bio; 
    }
    
    public String[] getFriendObjects() {
        return friendObjects;
    }
 
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
 
    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }
 
    public void setBio(String bio) {
        this.bio = bio;
    }
 
    public void setFriendObjects(String[] friendObjects) {
        this.friendObjects = friendObjects;
    }

    
    public void userException() throws Exception {
        if (name.isEmpty()) {
            throw new Exception("Username can't be empty");
        }
    }
  
}