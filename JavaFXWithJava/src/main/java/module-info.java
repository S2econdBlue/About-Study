module com.example.javafxwithjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxwithjava to javafx.fxml;
    exports com.example.javafxwithjava;
}