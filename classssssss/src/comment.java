public class comment extends post {
    private String text;
    private int commentCount;
    private String timestamp;
    private String commentId;
   
    // Default constructor
    public comment() {
    }

    // Parameterized constructor
    public comment(String text, int commentCount , String commentId, String timestamp ) {
        this.text = text;
        this.commentId=commentId;
        this.commentCount = commentCount;
        this.timestamp = timestamp;
    }

    // Getters and Setters for text and commentCount and time

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    //method
    public void postComment() {
        System.out.println("Comment posted: " + text);
    }


}