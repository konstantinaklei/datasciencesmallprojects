module com.example.ergasia6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.example.ergasia6 to javafx.fxml;
    exports com.example.ergasia6;
}