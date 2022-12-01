import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class WriterControl {
    String words = "";
    @FXML
    TextArea textArea_file,textArea_field,textAnsField;
    public static void main(String[] args) {
        
    }
    public void write(ActionEvent e)
    {
        // String words = "";
        words = textArea_field.getText();
        
        try 
        {
            FileWriter frw = new FileWriter(textArea_file.getText()+".txt",true);
            BufferedWriter bw = new BufferedWriter(frw);
            bw.write(words);
            bw.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // label.setText("");
    }
    public void read(ActionEvent  e) throws IOException
    {
        String text;
        try {
            FileReader fr = new FileReader(textArea_file.getText()+".txt");
            BufferedReader br = new BufferedReader(fr);
            while((text = br.readLine()) !=null )
            {
                words+=text;
            }
            // System.out.println(words);
            textAnsField.setText(words);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            textAnsField.setText("FILE NOT FOUND");
        }
        // System.out.println("read");
        // label.setText("read man");
    }
    public void clear(ActionEvent e)
    {
        textAnsField.setText("");
        // System.out.println("ki");
        // label.setText("");
    }
}
