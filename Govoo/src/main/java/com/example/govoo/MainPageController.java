package com.example.govoo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainPageController extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button main_page_back_button;

    @FXML
    private Button main_page_booking_button;

    @FXML
    private Button main_page_lookBooking_button;

    @FXML
    void initialize() {
        main_page_back_button.setOnAction(event -> {
            openNewScene(main_page_back_button, "start_page.fxml");
        });

        main_page_booking_button.setOnAction(event -> {
            openNewScene(main_page_booking_button, "first_room_page.fxml");
        });

        main_page_lookBooking_button.setOnAction(event -> {
            openNewScene(main_page_lookBooking_button, "look_booking_page.fxml");
        });


    }

}
