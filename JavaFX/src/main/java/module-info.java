module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
}