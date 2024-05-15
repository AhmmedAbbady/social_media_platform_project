import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;


import java.io.IOException;

public class controlAddcomment {
   Parent root;
   Stage stage;
   Scene scene;

   @FXML
   private ImageView addpostimg;

   @FXML
   private Text addposttext;

   @FXML
   private Label firstcomment;
   @FXML
   private Button backhomecomment;


   @FXML
   private Button postimg;

   @FXML
   private TextField posttxt;

   @FXML
   private VBox postveb;

   @FXML
   void addimg(MouseEvent event) {

   }

   @FXML
   void addtext(ActionEvent event) {

   }

   @FXML
   void gohomecomment(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("newsFeeeeed.fxml"));
      stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();

   }
   @FXML
   void sendcooment(ActionEvent event) {
      String comm;
      comm = posttxt.getText();
      firstcomment.setText(comm);


   }


}
