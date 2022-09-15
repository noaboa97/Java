module com.example.w12figuren {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w12figuren to javafx.fxml;
    exports com.example.w12figuren;
}