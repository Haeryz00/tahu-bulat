module code.lab5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens code.lab5 to javafx.fxml;
    exports code.lab5;
}
