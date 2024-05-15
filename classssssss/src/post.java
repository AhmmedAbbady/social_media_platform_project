import java.awt.image.BufferedImage;
public class post {
    protected BufferedImage post_image;
    protected String post_text;

    public post(){
        //default
    }
    public post(BufferedImage IMA ,String ext ){
        //default
    }

    //setters
    public void set_image(BufferedImage post_ima){
      post_image=post_ima;  
    }
    public void set_tex(String post_te){
       post_text=post_te;  
      }
      //getters
    public BufferedImage get_image(){
        return post_image;
    }
    public String get_text(){
        return post_text;
    }

    //methods
    public void clearImage() {
        post_image = null;
    }
    public boolean hasText() {
        return post_text != null && !post_text.isEmpty();
    }
        
    public boolean isEmpty() {
        return post_image == null && (post_text == null || post_text.isEmpty());
    }

    public void displayDetails() {
        System.out.println("Post Image: " + (post_image != null ? "Available" : "Not Available"));
        System.out.println("Post Text: " + (post_text != null ? post_text : "No text"));
    }
    
    
}
