import java.io.FileInputStream;

import javax.swing.GroupLayout.Alignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabelAthi extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label();
        label.setText("enter your age:");
        label.setTextFill(Color.RED);   
        label.setWrapText(true);
        // FileInputStream fis = new FileInputStream("button2.png");
        // ImageView img = new ImageView(new Image(fis));
        // // label.setTAlignment(Alignment.CENTER);
        // HBox h = new HBox();
        // h.getChildren().add(new Button("click me",img));
        Scene scene = new Scene(label);
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(500);
        stage.show();
        // fis.close();
    }
}
