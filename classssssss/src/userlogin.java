public class userlogin extends user_registeration {
       

    //this class is for future database



    //constructor 
    public userlogin(){
        //default
    }

    public userlogin(String user_mail ,String user_pass){
       super(user_mail,user_pass);
    }

    public boolean authenticate() {
        if (get_mail().equals("example@gmail.com") && get_pass().equals("password123")) {
            return true;
        } else {
            return false;
        }
    
        }
}