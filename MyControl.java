import javax.crypto.Cipher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

// import javafx.application.Application;

// import javafx.application.Application;
// import javafx.stage.Stage;

public class MyControl 
{
    
    @FXML
    private Circle circle;
    double x,y;
    public void up(ActionEvent e)
    {
        circle.setCenterY(y-=15);
        System.out.println("ji");
    
    }
    public void down(ActionEvent e)
    {
        circle.setCenterY(y+=15);
        System.out.println("down");
    
    }
    public void left(ActionEvent e)
    {
        circle.setCenterX(x-=15);
        System.out.println("left");
    
    }
    public void right(ActionEvent e)
    {
        circle.setCenterX(x+=15);
        System.out.println("right");
    
    }


}
