package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class LoginForm extends Application {

    public static final String USERNAME =  "admin";
    public static final String PASSWORD = "12345";

    public static void main(String[] args) {launch(args);}
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(getClass().getName());
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10,10,10,10));

        Text sceneTitle = new Text("Welcome!");
        sceneTitle.setFont(Font.font("Arial Black", 20));
        grid.add(sceneTitle,0,0);

        Label labelUsername = new Label("UserName: ");
        grid.add(labelUsername,0,1);

        TextField userTextField = new TextField("Enter your username...");
        grid.add(userTextField, 0 , 2);

        Label labelPassword = new Label("Password: ");
        grid.add(labelPassword,0,3);

        TextField passTextField = new TextField("Enter your password...");
        grid.add(passTextField, 0 , 4);

        Button btn = new Button("Enter");
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                boolean check = false;
                if((userTextField.getText().equals(USERNAME)) && (passTextField.getText().equals(PASSWORD))) {
                    check = true;
                    window(check);
                }
                else {
                    window(check);
                }
            }
        });
        grid.add(btn,0,5);

        Scene scene = new Scene(grid, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void window(boolean b) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(b) {
            alert.setContentText("Successful! Greetings!");
        }
        else {
            alert.setAlertType(Alert.AlertType.WARNING);
            alert.setContentText("Warning! Wrong username or password!");
        }
        alert.showAndWait();
    }


}
