import javafx.application.Application;import javafx.event.ActionEvent;import javafx.event.EventHandler;import javafx.scene.control.Button;import javafx.scene.control.Label;import javafx.scene.layout.VBox;import javafx.scene.text.Font;import javafx.scene.Scene;import javafx.stage.Stage;public class HelloJfxProperties extends Application {    int count = 10;    @Override public void start(Stage stage) {        Label counterLabel = new Label("Count: " + count);        Button incButton = new Button("Increment Count");        incButton.setOnAction(event ->            { counterLabel.setText("Count: " + (--count)); });        counterLabel.textProperty().addListener(            (property, oldValue, newValue) -> {                if (newValue.equals("Count: 0")) {                    counterLabel.setText("BOOM!");                    counterLabel.setFont(new Font(100));                    incButton.setDisable(true);                }            });        VBox root = new VBox();        root.getChildren().addAll(counterLabel, incButton);        Scene scene = new Scene(root);        stage.setScene(scene);        stage.setTitle("Hello");        stage.show();    }}