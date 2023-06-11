package com.example.govoo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LookBookingController extends  Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button lookBooking_page_back_button;

    @FXML
    void initialize() {
        lookBooking_page_back_button.setOnAction(event -> {
            openNewScene(lookBooking_page_back_button, "main_page.fxml");
        });
    }

}
