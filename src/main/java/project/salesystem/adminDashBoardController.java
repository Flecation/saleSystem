package project.salesystem;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import project.Utils.buttonEffect;
import project.Utils.changeSection;
import project.models.users;


public class adminDashBoardController {
    @FXML
    BorderPane root;

    @FXML
    ScrollPane rootPane;

    @FXML
    VBox menuPane;

    @FXML
    ImageView userImage;

    @FXML
    Label userNameLbl;

    @FXML
    Button dashBoardBtn,categoryBtn,productBtn,settingBtn,userBtn,miniBtn,sizeBtn,exitBtn;

    private users userInfo = loginController.loginUser;

    private buttonEffect button = buttonEffect.getInstance();



    @FXML
    public void initialize() {

            button.setMenuButton(root,miniBtn,sizeBtn,exitBtn);

            userNameLbl.setText(userInfo.getUserName());



    }



}
