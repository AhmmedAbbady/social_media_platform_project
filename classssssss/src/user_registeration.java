public class user_registeration extends user {

    protected String user_mail;
    protected String user_pass;
    private boolean validatepass=false;
    private boolean validatemail=false;

    public  user_registeration(){
        //default
    }
    public  user_registeration(String user_mail ,String user_pass){
        this.user_mail = user_mail;
        this.user_pass = user_pass;
        //default
    }

    public  user_registeration(String user_mail ,String user_pass,  boolean validatepass,  boolean validatemail){
        this.user_mail=user_mail;
        this.user_pass=user_pass;

        this.validatemail=validatemail;
        this.validatepass=validatepass;
        //default
    }

    //setters
    public void set_mail(String maillll ){
        user_mail=maillll;
    }
    public void set_pass(String passs ){
        user_pass=passs;
    }
    public void setvalidatemail(boolean validatemail){
        this.validatemail=validatemail;
    }
    public void setvalidatepass(boolean validatepass){
        this.validatepass=validatepass;
    }
    //getters
    public String get_mail(){
        return user_mail;
    }
    public String get_pass(){
        return user_pass;
    }
    public String getvalidatemail(){
        return user_mail;
    }
    //func
    public int usermailcheck()  {
        String mailcheck = user_mail.substring(user_mail.length() - 10);
        int chekerrr1;
        if (!mailcheck.equals("@gmail.com")) {
            chekerrr1=0;

        }
        else{
            chekerrr1=1;//true

        }
        return chekerrr1;
    }

    public int passwordcheck() {
        int checkkerr2;
        if (!Character.isUpperCase(user_pass.charAt(0))) {

            checkkerr2=0 ;
        }
        else{
            checkkerr2=1;
        }
        return checkkerr2;

    }
    public int validAll() {
        int a;
        if (passwordcheck() == 1 && usermailcheck() == 1) {
            a = 1;
        } else {
            a = 0;
        }
        return a;
    }


//    public boolean checktologinfunction(){
//        if(passwordStartException()==true){
//            return true;
//        }
//        else {
//            return false;
//        }
    }

