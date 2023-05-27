module com.example.javafxstart {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxstart to javafx.fxml;
    exports com.example.javafxstart;
    exports com.example.javafxstart.controller;
    opens com.example.javafxstart.controller to javafx.fxml;
}