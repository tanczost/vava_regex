module com.example.regex_vava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.regex_vava to javafx.fxml;
    exports com.example.regex_vava;
}