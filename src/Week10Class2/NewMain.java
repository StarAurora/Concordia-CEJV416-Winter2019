/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxdialog;

import java.util.Optional;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author j_zho11
 */
public class FXDialog extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Choose something");
                alert.setContentText("Choose an option");
                
                ButtonType bt1 = new ButtonType("Apples");
                ButtonType bt2 = new ButtonType("Bananas");
                ButtonType bt3 = new ButtonType("Kiwis");
                ButtonType bt4 = new ButtonType("Flingflongers");
                
                alert.getButtonTypes().setAll(bt1,bt2,bt3,bt4);
                Optional<ButtonType> result = alert.showAndWait();
                
                if(result.get()==bt1){
                    System.out.println("You ordered Apples");
                }
                if(result.get()==bt2){
                    System.out.println("You ordered Bananas");
                }
                if(result.get()==bt3){
                    System.out.println("You ordered Kiwis");
                }
                if(result.get()==bt4){
                    System.out.println("You ordered Flingflongers");
                }
                
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
