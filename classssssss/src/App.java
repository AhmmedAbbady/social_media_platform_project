import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    

    @Override
    public void start(Stage arg0) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("loginScene.fxml"));
       // Scene scene_login = new Scene(root, 400 , 400);
       // arg0.setScene(scene_login);
       // arg0.show();
       arg0.setTitle("Login: ");
      arg0.setScene(new Scene(root,1580,750));
     // arg0.setFullScreen(true);
       arg0.show();
    }




    public static void main(String[] args) throws Exception {
        ///System.out.println("Hello, World!");
        
        launch(args);
    }
}
