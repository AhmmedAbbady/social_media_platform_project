import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class control_newsFeeeed {
    Parent root;
    Stage stage;
    Scene scene;
    String usernameeee;

    @FXML
    private Button addcomm_1;

    @FXML
    private Button addcomm_2;

    @FXML
    private Button addpostBtn;

    @FXML
    private ImageView addposticon;

    @FXML
    private ImageView addpostimg;

    @FXML
    private HBox cr7img;

    @FXML
    private SplitMenuButton frienddd;

    @FXML
    private ImageView icon_accNews;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img22;

    @FXML
    private ImageView imgview1;

    @FXML
    private ImageView imgview2;

    @FXML
    private Label lausername;

    @FXML
    private ImageView like_post1;

    @FXML
    private ImageView like_post2;

    @FXML
    private Button logoutttt;

    @FXML
    private Text newstext;

    @FXML
    private Text notificationstext;

    @FXML
    private ImageView ppimage;

    @FXML
    private Button profileBtn;

    @FXML
    private Label uer1;

    @FXML
    private Label user22;

    @FXML
    void Switchtoprofile(MouseEvent event) {

    }
    @FXML
    void addcommentbutton1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("commentview.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void addcommentbutton2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("commentview.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void newsfeGoprofile(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("userprofile.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void logoutAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loginScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void newsfeeGoaddPost(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("createpost.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
