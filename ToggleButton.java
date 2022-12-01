import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ToggleButton extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        // ToggleGroup toggleButton = new ToggleGroup();
        // RadioButton op;
        
        VBox v = new VBox();
        // for(int i =1;i<10;i++)
        // {
        //     op = new RadioButton("subject "+i);
        //     // op.setToggleGroup(toggleButton);
        //     v.getChildren().addAll(op);
        // }
        Circle cir = new Circle();
        cir.setRadius(20);
        Hyperlink link = new Hyperlink("https://www.codechef.com/");

        FileInputStream fio = new FileInputStream("goku.jpg");
        ImageView img = new ImageView(new Image(fio));
        for(int i=1;i<10;i++)
        {
            op = new CheckBox("subject"+i);
            v.getChildren().add(op);
        }
        v.getChildren().add(link);
        // VBox v = new VBox();
        // op = new RadioButton("bye");
        // v.getChildren().add(op);
        // Scene scene = new Scene(v);
        // stage.setScene(scene);
        v.getChildren().add(cir);
        v.getChildren().add(img);
       Scene scene = new Scene(v);
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(500);
        stage.show();
    }
    
}
