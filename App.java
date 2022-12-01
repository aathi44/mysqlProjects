import javax.swing.Icon;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.*;
public class App extends Application
{
   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Group root = new Group();
        Image icon = new Image("goku.jpg");
        arg0.getIcons().add(icon);
        arg0.setX(300);
        
        arg0.setWidth(1000);
        arg0.setHeight(1000);
        //arg0.setFullScreen(true);
        // arg0.setFullScreenExitHint("enter q to exit");
        Text text = new Text();
        text.setText("aathi legend");
        text.setX(500);
        text.setY(500);
        text.setFont(Font.font(60));
        text.setOpacity(0.2);
        arg0.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(100);
        line.setEndX(0);
        line.setEndY(0);
        line.setStrokeWidth(10);
        line.setStroke(Color.RED);



        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(200);
        rectangle.setX(100);
        rectangle.setY(200);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.RED);
        rectangle.setFill(Color.GREEN);
        Scene s = new Scene(root,Color.AQUAMARINE);
        root.getChildren().add(rectangle);
        arg0.setScene(s);
        root.getChildren().add(line);
        root.getChildren().add(text);
        arg0.setTitle("aathi");
        arg0.show();
        
    }
   
}