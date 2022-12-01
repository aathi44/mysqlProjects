import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuCreating extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        MenuBar menu = new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        Menu go = new Menu("Go");

        MenuItem newTExtFile = new MenuItem("New Text File");
        MenuItem newWindow = new MenuItem("New Window");
        
        Menu newFile = new Menu("New File");// is a sub menu
        MenuItem textFile = new MenuItem("Text File");
        MenuItem java = new MenuItem(" Java File");
        MenuItem python = new MenuItem("Python File");
        newFile.getItems().addAll(textFile,java,python);

        MenuItem exit = new MenuItem("Exit");
        file.getItems().addAll(newTExtFile,newWindow,newFile,exit);

        MenuItem undo = new MenuItem("Undo");
        MenuItem  redo = new MenuItem("Redo");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        edit.getItems().addAll(undo,redo,cut,copy);


        MenuItem problem = new MenuItem("Probelem");
        MenuItem search = new MenuItem("Search");
        MenuItem explore = new MenuItem("Explore");
        MenuItem terminal= new MenuItem("Terminal");
        view.getItems().addAll(problem,search,explore,terminal);


        MenuItem nextproblem = new MenuItem("Next Probelem");
        MenuItem Back = new MenuItem("Back");
        MenuItem previous = new MenuItem("Previous Problem");
        MenuItem nextChange= new MenuItem("Next Change");
        go.getItems().addAll(nextproblem,previous,nextChange,Back);

        menu.getMenus().addAll(file,edit,view,go);
        BorderPane border = new BorderPane();
        border.setTop(menu);

        Scene scene = new Scene(border);
        stage.setTitle("aathi page");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();
    }
}
