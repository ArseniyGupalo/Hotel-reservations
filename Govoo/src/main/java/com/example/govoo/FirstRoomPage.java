package com.example.govoo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FirstRoomPage extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView narrow_to_2;

    @FXML
    private Button first_room_page_bron1_button;

    @FXML
    private Button first_room_page_bron2_button;

    @FXML
    private Button back_button_1;

    @FXML
    void initialize(MouseEvent event) {

    }

    @FXML
    void initialize() {
        back_button_1.setOnAction(event -> {
            openNewScene(back_button_1, "main_page.fxml");
        });

        narrow_to_2.setOnMouseClicked(mouseEvent -> {
            openNewScene(narrow_to_2, "second_room_page.fxml");
        });

        first_room_page_bron1_button.setOnAction(event -> {

            BookNewUser();

        });
    }


    public void BookNewUser() {
        DataBaseHandler dbHandler = new DataBaseHandler();

        User user = new User();
        Rooms room = new Rooms();

        dbHandler.BookingRoom(user, room);
    }


}
