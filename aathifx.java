import java.lang.StackWalker.StackFrame;
import java.security.cert.TrustAnchor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;
public class aathifx extends Application 
{
    public void start(Stage stage)throws Exception
    {
        // Button bt1 = new Button("click me");
        // Button bt2 = new Button("click me");
        // Button bt3 = new Button("click me");
        // Button bt4 = new Button("click me");
        // Button bt5 = new Button("click me");
        // Button bt6 = new Button("click me");
        // Button bt7 = new Button("click me");
        // Button bt8= new Button("click me");
        // Button bt9 = new Button("click me");
        // Button bt10 = new Button("click me");
        
        HBox hr = new HBox();
        VBox vr = new VBox();
        FlowPane flow = new FlowPane();
        // BorderPane pane = new BorderPane();
        // pane.getChildren().add(bt);
        // pane.getCenter();
        for(int i =1;i<=10;i++)
        {
            hr.getChildren().addAll(new Button("click me "+ i));
        }
        for(int i =1;i<=10;i++)
        {
            vr.getChildren().addAll(new Button("click me "+ i));
        }
        for(int i =1;i<=10;i++)
        {
            flow.getChildren().addAll(new Button("click me "+ i));
        }
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(new Button("click me "));
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setGridLinesVisible(true);
        for(int i = 0;i<10;i++)
        {
            grid.add(new Button(),i,i);
        }
        
        Scene scene = new Scene(borderPane);
        // Scene scene1 = new Scene(hr);
        stage.setWidth(500);
        stage.setHeight(500);
        // stage.setScene(scene1);
        // // stage.show();
        // // Thread.sleep(3000);
        // Scene scene2 = new Scene(vr);
        // stage.setScene(scene2);
        // stage.show();
        // stage.getTitle();
        stage.setScene(scene);
        stage.show();
        
        // Thread.sleep(5000);
        // stage.close();
    }
    public static void main(String[] args) {
        launch(args);
    }
   
}