module com.example.govoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.govoo to javafx.fxml;
    exports com.example.govoo;
}