import javax.security.auth.Subject;
import javax.security.auth.callback.LanguageCallback;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxAthi extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub

        ComboBox<String> box = new ComboBox<String>();
        box.getItems().add("tamil");
        box.getItems().add("english");
        box.getItems().add("math");
        box.getItems().add("science");
        VBox v = new VBox();
        v.getChildren().add(box);
        Scene scene = new Scene(v);
        stage.setWidth(400);
        stage.setHeight(400);
        stage.setScene(scene);
        stage.show();
        


    }
    
}
