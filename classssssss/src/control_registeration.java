import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;

public class control_registeration {

    Parent root;
    Stage stage;
    Scene scene;

    String singuptxt_email;
    String getSinguptxt_pass;


    @FXML
    private Button Sign_pageF;
    @FXML
    private Label label_singup;
    @FXML
    private TextField Siip_email;

    @FXML
    private PasswordField siup_pass;

    @FXML
    void signuppp(ActionEvent event) throws IOException {

        singuptxt_email = Siip_email.getText();
        getSinguptxt_pass = siup_pass.getText();
        System.out.println("Email:  " +  singuptxt_email);
        System.out.println("Pass:  " + getSinguptxt_pass);
        user_registeration sss = new user_registeration(singuptxt_email, getSinguptxt_pass);
        if (sss.validAll() == 1) {

        root = FXMLLoader.load(getClass().getResource("newsFeeeeed.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
        else{
            label_singup.setText(" Invalid Input..Email Ends with '@gmail.com' Password Starts Capital");

        }
    }

}