import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class simpleaathi extends Application {
    public static void main(String[] args) {
        launch(args);   
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        Parent root = FXMLLoader.load(getClass().getResource("/mainframe2.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        // stage.setWidth(400);
        // stage.setHeight(500);

        // MyControl ob = new MyControl();
        stage.show();
    }
    
}
