package com.example.govoo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class SecondRoomPage extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView narrow_to_1;

    @FXML
    private Button second_room_page_bron1_button;

    @FXML
    private Button second_room_page_bron2_button;

    @FXML
    private Button back_button_2;

    @FXML
    private Button narrow_to_first;

    @FXML
    void initialize() {
        back_button_2.setOnAction(event -> {
            openNewScene(back_button_2, "main_page.fxml");
        });

        narrow_to_1.setOnMouseClicked(mouseEvent -> {
            openNewScene(narrow_to_1, "first_room_page.fxml");
        });

        narrow_to_first.setOnAction(event -> {
            openNewScene(narrow_to_first, "first_room_page.fxml");
        });
    }

}
