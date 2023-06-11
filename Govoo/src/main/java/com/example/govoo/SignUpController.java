package com.example.govoo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signup_back_button;

    @FXML
    private CheckBox signup_checkbox_female;

    @FXML
    private CheckBox signup_checkbox_male;

    @FXML
    private TextField signup_country;

    @FXML
    private TextField signup_login;

    @FXML
    private PasswordField signup_password;

    @FXML
    private TextField signup_phonenumber;

    @FXML
    private TextField signup_pib;

    @FXML
    private Button signup_reg_button;

    @FXML
    void initialize() {

        signup_reg_button.setOnAction(event -> {
            signUpNewUser();
            openNewScene(signup_back_button, "menu_page.fxml");
        });

        signup_back_button.setOnAction(event -> {
            openNewScene(signup_back_button, "menu_page.fxml");
        });

    }

    private void signUpNewUser() {
        DataBaseHandler dbHandler = new DataBaseHandler();

        String firstName = signup_pib.getText();
        String phone = signup_phonenumber.getText();
        String userName = signup_login.getText();
        String password = signup_password.getText();
        String location = signup_country.getText();
        String gender;
        if (signup_checkbox_male.isSelected()) {
            gender = "Male";
        } else
            gender = "Female";

        User user = new User(firstName, phone, userName, password, location, gender);


        dbHandler.signUpUser(user);
    }

}
