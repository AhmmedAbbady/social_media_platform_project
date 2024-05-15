import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.io.IOException;

public class control_userprofile {
    Parent root;
    Stage stage;
    Scene scene;


    @FXML
    private Button posts;

    @FXML
    private ImageView userpic;
    @FXML
    private Button logoutinprofile;
    @FXML
    private Label userprofile_label;

    @FXML
    void go_to_posts(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("createpost.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void logoutbtnprrooo(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loginScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
