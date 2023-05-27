module com.example.fxstart {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.fxstart to javafx.fxml;
    exports com.example.fxstart;
}