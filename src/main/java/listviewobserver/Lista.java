package listviewobserver;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Lista extends Application {
    public void start(Stage stage) {
        //Label for education
        Label label = new Label("Educational qualification:");
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        label.setFont(font);


        ObservableList<String> colores = FXCollections.observableArrayList("Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Morado", "Rosa", "Negro", "Blanco", "Gris", "Marron", "Celeste");
        ListView<String> listView = new ListView<String>(colores);
        listView.setMaxSize(200, 160);


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(5, 5, 5, 50));
        layout.getChildren().addAll(label, listView);
        layout.setStyle("-fx-background-color: BEIGE");

        //
        Button deleteBtn = new Button("Borrar");
        deleteBtn.setOnAction(e -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            colores.remove(selectedIndex);
        });


        HBox buttonLayout = new HBox(10);
        buttonLayout.getChildren().add(deleteBtn);
        layout.getChildren().add(buttonLayout);

        Scene scene = new Scene(layout, 595, 200);
        stage.setTitle("Ejemplo List View Observable");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
