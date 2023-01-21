module listviewobserver {
    requires javafx.controls;
    requires javafx.fxml;

    opens listviewobserver to javafx.fxml;
    exports listviewobserver;
}
