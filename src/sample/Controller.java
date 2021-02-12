package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


import java.awt.*;

public class Controller {

   @FXML
   public Button button;
    @FXML
    public TextArea Text;
    @FXML
    public TextArea Text2;


    public  void btn2OnclicK(ActionEvent actionEvent) {
        Text.appendText(Text2.getText()+ "\n");
        Text2.clear();
        Text2.requestFocus();

    }

    public void TextAriaSend(KeyEvent keyEvent) {
        if (keyEvent.isShiftDown() && keyEvent.getCode().equals(KeyCode.ENTER)){
            Text.appendText(Text2.getText() + "\n");
            Text2.clear();
            Text2.requestFocus();

        }
    }
}
