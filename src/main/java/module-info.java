module com.example.labs4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.labs4 to javafx.fxml;
    exports com.example.labs4;
}