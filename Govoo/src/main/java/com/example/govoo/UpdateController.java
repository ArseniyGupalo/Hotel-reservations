package com.example.govoo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UpdateController extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button update_page_back_button;

    @FXML
    private CheckBox update_page_checkbox_male;

    @FXML
    private TextField update_page_country;

    @FXML
    private TextField update_page_login;

    @FXML
    private PasswordField update_page_password;

    @FXML
    private TextField update_page_phonenumber;

    @FXML
    private TextField update_page_pib;

    @FXML
    private Button update_page_update_button;

    @FXML
    void initialize() {
        update_page_back_button.setOnAction(event -> {
            openNewScene(update_page_back_button, "menu_page.fxml");
        });

        update_page_update_button.setOnAction(event -> {
            updateUser();
            openNewScene(update_page_update_button, "menu_page.fxml");
        });
    }

    private void updateUser() {
        DataBaseHandler dbHandler = new DataBaseHandler();

        String firstName = update_page_pib.getText();
        String phone = update_page_phonenumber.getText();
        String userName = update_page_login.getText();
        String password = update_page_password.getText();
        String location = update_page_country.getText();
        String gender;
        if (update_page_checkbox_male.isSelected()) {
            gender = "Male";
        } else
            gender = "Female";

        User user = new User(firstName, phone, userName, password, location, gender);


        dbHandler.updateUser(user);
    }

}
