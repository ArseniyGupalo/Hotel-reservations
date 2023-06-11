package com.example.govoo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button menu_page_back_button;

    @FXML
    private Button menu_page_delete_button;

    @FXML
    private Button menu_page_loginSignUpButton;

    @FXML
    private Button menu_page_update_button;


    @FXML
    void initialize() {
        menu_page_back_button.setOnAction(event -> {
            openNewScene(menu_page_back_button, "start_page.fxml");
        });

        menu_page_loginSignUpButton.setOnAction(event -> {
            openNewScene(menu_page_loginSignUpButton, "signUp_page.fxml");
        });

        menu_page_delete_button.setOnAction(event -> {
            openNewScene(menu_page_delete_button, "delete_page.fxml");
        });

        menu_page_update_button.setOnAction(event -> {
            openNewScene(menu_page_update_button, "update_page.fxml");
        });

    }

}
