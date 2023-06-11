package com.example.govoo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class DeleteController extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField delete_login_field;

    @FXML
    private Button delete_page_back_button;

    @FXML
    private Button delete_page_button;

    @FXML
    private PasswordField delete_password_field;

    @FXML
    void initialize() {
        delete_page_back_button.setOnAction(event -> {
            openNewScene(delete_page_back_button, "menu_page.fxml");
        });

        delete_page_button.setOnAction(event -> {
            String loginText = delete_login_field.getText().trim();
            String loginPassword = delete_password_field.getText().trim();

            if (!loginText.equals("") && !loginPassword.equals("")) {
                DeleteUser(loginText, loginPassword);
                openNewScene(delete_page_button, "menu_page.fxml");
            }
            else {
                System.out.println("Login and Password are empty");
            }
        });
    }

}
