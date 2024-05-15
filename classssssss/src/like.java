
public class like extends post {
    private String[] likes;
    private String likeId; 
    private String userId;
    private String timestamp;
    private int likescount;
    private boolean alreadyLiked;



    // Constructor to initialize a like
    public like( String[] likes , String likeId, String userId, String timestamp) {
        this.likeId = likeId;
        this.userId = userId;
        this.timestamp = timestamp;
		this.alreadyLiked = false;
        this.likes=likes;
		
    }

    // Default constructor
    public like() {
    }

    // Getters and Setters for likes and likeCount

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
    }

    public String[] getLikes() {
        return likes;
    }

    public void setlikes(String[] likes) {
        this.likes = likes;
    }

    public int getlikeCount() {
        return likescount;
    }
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }



    
   // Method to like the content
    public void likeContent() {
	if (alreadyLiked) {
            throw new IllegalStateException("User has already liked this content.");
        }
        // Logic to save the like to the database or update the UI
        System.out.println("Content liked by user " + userId);
        alreadyLiked = true;
        likescount++; // Increment likesCount when a user likes the content
    }
    
}