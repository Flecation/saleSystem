package project.Utils;


import javafx.animation.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class changeSection {

    public static  void switchScene(Parent root, String fxmlFile){
        Stage stage = (Stage)  root.getScene().getWindow();

        try{
            Parent newRoot = FXMLLoader.load(changeSection.class.getResource(fxmlFile));
            stage.setScene(new Scene(newRoot));
            stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void switchPage(ScrollPane scrollPane, String fxmlFile) {
        try {
            Parent newContent = FXMLLoader.load(changeSection.class.getResource(fxmlFile));
            scrollPane.setContent(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
