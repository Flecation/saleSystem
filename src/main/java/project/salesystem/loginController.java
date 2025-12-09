package project.salesystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import project.Utils.changeSection;
import project.Utils.database;
import project.Utils.buttonEffect;
import project.models.users;


public class loginController {

    @FXML
    BorderPane root;

    @FXML
    Button loginBtn,exitBtn,sizeBtn,miniBtn,showPasswordBtn,hidePasswordBtn;

    @FXML
    Label forgetBtn;

    @FXML
    ImageView loginImage;

    @FXML
    TextField txtName,txtPasswordShow;

    @FXML
    PasswordField txtPassword;


    public static users loginUser;

    private buttonEffect button = buttonEffect.getInstance();

    @FXML
    void initialize(){

          button.setMenuButton(root,miniBtn,sizeBtn,exitBtn);

          button.setPasswordBtn(txtPasswordShow,txtPassword,showPasswordBtn,hidePasswordBtn);

          txtPasswordShow.setVisible(false);
          showPasswordBtn.setVisible(false);

          txtName.setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode() == KeyCode.ENTER){
                    if(txtPassword.isVisible()){
                        txtPassword.requestFocus();
                    }else {
                        txtPasswordShow.requestFocus();
                    }
                }
                if (keyEvent.getCode() == KeyCode.DOWN){
                    if(txtPassword.isVisible()){
                        txtPassword.requestFocus();
                    }else {
                        txtPasswordShow.requestFocus();
                    }
                }else{

                }
          });

          txtPassword.setOnKeyPressed(keyEvent -> {
              if (keyEvent.getCode() == KeyCode.ENTER){
                  loginBtn.fire();
              }
              if (keyEvent.getCode() == KeyCode.UP){
                  txtName.requestFocus();
              }
          });

          txtPasswordShow.setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode() == KeyCode.ENTER){
                    loginBtn.fire();
                }
                if (keyEvent.getCode() == KeyCode.UP){
                      txtName.requestFocus();
                }
          });

          sizeBtn.setDisable(true);

          loginBtn.setOnAction(event -> {
                String userName = txtName.getText();

                String userPassword = txtPassword.isVisible()? txtPassword.getText() : txtPasswordShow.getText();


                if(userName.isEmpty() || userPassword.isEmpty() ) {
                    System.out.println("Please enter both username and password.");

                }else{
                    checkUser(userName, userPassword);
                }

          });
    }

    private void checkUser(String username, String password) {

        loginUser = database.userLogin(username,password);

        if(loginUser != null) {

                System.out.println("Login successful! User ID: " + loginUser.getUserId());
                login(loginUser.getUserRole());


        }else{
            System.out.println("It will show with the notification bar");
        }
    }

    private void login(String role){

        if (role.equalsIgnoreCase("admin")){
            changeSection.switchScene(root,"/project/salesystem/adminDashBoard.fxml");

        }else if(role.equalsIgnoreCase("casher"))   {
            changeSection.switchScene(root,"");

        }else{
            System.out.println("nothing to change");

        }
    }


}
