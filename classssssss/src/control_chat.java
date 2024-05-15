import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class control_chat {
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private Button afterchat;

    @FXML
    private TextArea chat_id;

    @FXML
    void afterchatggg(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("afterchat.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}
