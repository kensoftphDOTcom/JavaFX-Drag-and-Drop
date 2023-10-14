module com.kensoftph.dragndrop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.dragndrop to javafx.fxml;
    exports com.kensoftph.dragndrop;
}