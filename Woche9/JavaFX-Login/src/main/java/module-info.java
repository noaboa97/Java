module com.example.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxlogin to javafx.fxml;
    exports com.example.javafxlogin;
}