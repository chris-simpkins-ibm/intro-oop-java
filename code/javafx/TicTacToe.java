import javafx.application.Application;import javafx.geometry.Pos;import javafx.geometry.Insets;import javafx.scene.control.Button;import javafx.scene.layout.GridPane;import javafx.scene.Scene;import javafx.stage.Stage;public class TicTacToe extends Application {    private boolean xTurn = true;    private Button mkButton() {        Button button = new Button();        button.setOnAction(e -> {                button.setText(xTurn ? "X" : "O");                xTurn = !xTurn;                button.setDisable(true);            });        return button;    }    @Override public void start(Stage stage) {        // Create UI Controls        Button topLeft = new Button();        topLeft.setOnAction(e -> {                topLeft.setText(xTurn ? "X" : "O");                xTurn = !xTurn;                topLeft.setDisable(true);            });        Button topCenter = new Button();        topCenter.setOnAction(e -> {                topCenter.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        Button topRight = new Button();        topRight.setOnAction(e -> {                topRight.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        Button middleLeft = new Button();        middleLeft.setOnAction(e -> {                middleLeft.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        Button middleCenter = new Button();        middleCenter.setOnAction(e -> {                middleCenter.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        Button middleRight = new Button();        middleRight.setOnAction(e -> {                middleRight.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        Button bottomLeft = new Button();        bottomLeft.setOnAction(e -> {                bottomLeft.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        Button bottomCenter = new Button();        bottomCenter.setOnAction(e -> {                bottomCenter.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        Button bottomRight = new Button();        bottomRight.setOnAction(e -> {                bottomRight.setText(xTurn ? "X" : "O");                xTurn = !xTurn;            });        // Add UI Controls to a scene graph root node        GridPane grid = new GridPane();        grid.setAlignment(Pos.CENTER);        grid.setHgap(10);        grid.setVgap(10);        grid.setPadding(new Insets(25, 25, 25, 25));        grid.add(topLeft, 0, 0);        grid.add(topCenter, 1, 0);        grid.add(topRight, 2, 0);        grid.add(middleLeft, 0, 1);        grid.add(middleCenter, 1, 1);        grid.add(middleRight, 2, 1);        grid.add(bottomLeft, 0, 2);        grid.add(bottomCenter, 1, 2);        grid.add(bottomRight, 2, 2);        // Add scene graph to stage, set stage, show        Scene scene = new Scene(grid);        stage.setScene(scene);        stage.setTitle("Tic Tac Toe");        stage.show();    }}