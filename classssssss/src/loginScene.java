import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class loginScene {

    public PasswordField password_field;
    Parent root;
    Stage stage;
    Scene scene;

    String txt_email;
    String txt_pass;

    @FXML
    private Text Email_text;

    @FXML
    private Text Pass_text;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_signup;

    @FXML
    private Label checktoLogin;

    @FXML
    private Text dont_have_acc;

    @FXML
    private PasswordField passworHiddd;

    @FXML
    private TextField tfEmail;

    @FXML
    private Label welcome;

    @FXML
    void login(ActionEvent event) throws IOException {
        txt_email = tfEmail.getText();
        txt_pass = passworHiddd.getText();
        System.out.println("Email:  " + txt_email);
        System.out.println("Pass:  " + txt_pass);
        user_registeration aaa = new user_registeration(txt_email, txt_pass);
        if (aaa.validAll() == 1) {

            root = FXMLLoader.load(getClass().getResource("newsFeeeeed.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            checktoLogin.setText("  Invalid Input..Email Ends with '@gmail.com' Password Starts Capital");
        }
    }
@FXML
void Signup(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("registeration.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}





}
