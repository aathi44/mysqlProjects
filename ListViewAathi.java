import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewAathi extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        // ListView<String> list = new ListView<>();
        // list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        // list.getItems().add("english");
        // list.getItems().add("tamil");
        // list.getItems().add("math");
        Label label = new Label();
        label.setText("enter your name:");
        TextField t = new TextField();

        PasswordField p = new PasswordField();
        t.setMaxWidth(40);
        GridPane box = new GridPane();
        // HBox box = new HBox();
        // VBox box = new VBox();
        box.add(t,2,0);
        box.add(p,8,8);
        Scene scene = new Scene(box);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();
    }
}
