module com.example.labshape {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;


    opens com.example.labshape to javafx.fxml;
    exports com.example.labshape;
}