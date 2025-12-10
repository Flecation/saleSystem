package project.salesystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import org.kordamp.ikonli.javafx.FontIcon;

public class alertController {
    @FXML
    static AnchorPane root;

    @FXML
    static Label iconLabel,titleLabel,descriptionLabel;



    public static void warningAlert(String text){
        root.setStyle("-fx-background-color:yellow;");
        FontIcon icon = new FontIcon("fas-exclamation-triangle");
        icon.setStyle("-fx-fill: yellow; ");
        icon.setIconSize(15);
        iconLabel.setGraphic(icon);
        titleLabel.setText("");
    }

    public void checkAlert(){
        root.setStyle("-fx-background-color: red;");
        FontIcon icon = new FontIcon("fas-");
    }

    public void deleteAlert(){

    }

    public void wrongAlert(){

    }


}
