import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


import java.io.File;
import java.io.IOException;

public class controller_post {
    Parent root;
    Stage stage;
    Scene scene;
    TextField posttextfield=new TextField();
    TextField displayField = new TextField();
    ImageView addpostim = new ImageView();
    Button addButton = new Button("Add Image");
    @FXML
    void addimg(ActionEvent event) {
        // Open a file chooser dialog
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", ".png", ".jpg", "*.gif")
        );
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            // Create an Image and set it in imageView
            Image image = new Image(((File) file).toURI().toString());
            addpostim.setImage(image);

            // Optionally, you can resize the ImageView to fit the image
            addpostim.setFitWidth(image.getWidth());
            addpostim.setFitHeight(image.getHeight());
            addpostim.setPreserveRatio(true);
        }
    };

    @FXML
    void addtext(ActionEvent event){
        String userText = posttextfield.getText();

        // Set the text in displayField
        displayField.setText(userText);
    }
    @FXML
    private ImageView addpostimg;
    @FXML
    private Button btngohome;

    @FXML
    private Text addposttext;

    @FXML
    private Button postimg;

    @FXML
    private TextField posttxt;

    @FXML
    private VBox postveb;

    @FXML
    void btngohome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("newsFeeeeed.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}